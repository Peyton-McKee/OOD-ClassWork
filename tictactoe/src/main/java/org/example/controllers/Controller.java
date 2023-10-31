package org.example.controllers;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import org.example.models.Board;
import org.example.models.Coord;

import java.util.Objects;
import java.util.Random;

/**
 * Represents the controller for a game of Whack-a-Mole.
 */
public class Controller {
    private final Board board;

    @FXML
    private final StringProperty[][] buttons;

    @FXML
    private final GridPane buttonGrid = new GridPane();

    private final Random rand = new Random();

    /**
     * Controller
     *
     * @param board the board of the game
     */
    public Controller(Board board) {
        this.board = Objects.requireNonNull(board);
        this.buttons = new StringProperty[board.getRowCount()][board.getColCount()];
    }

    /**
     * Initializes a game of Whack-a-Mole.
     *
     * @throws IllegalStateException if the game board is not defined
     */
    @FXML
    public void run() throws IllegalStateException {
        this.initButtons();
    }

    private void handleWhack(Coord coord) {

        buttons[coord.getRow()][coord.getCol()].set("");

    }

    private void initButtons() {
        // Populating a 2D grid probably looks very similar to populating a 2D array ...
        // so let's use a nested for-loop and loop through our board.

        for (int row = 0; row < this.board.getRowCount(); row++) {
            RowConstraints rowConstraints = new RowConstraints(); // new object
            rowConstraints.setVgrow(Priority.ALWAYS); // set a priority
            buttonGrid.getRowConstraints().add(rowConstraints); // add it

            // Populate the row
            for (int col = 0; col < this.board.getColCount(); col++) {
                ColumnConstraints colConstraints = new ColumnConstraints();
                colConstraints.setHgrow(Priority.ALWAYS); // setHgrow instead of setVgrow
                buttonGrid.getColumnConstraints().add(colConstraints);

                Coord coord = new Coord(row, col);

                Button button = new Button();
                button.setPrefSize(100, 100);
                button.setOnAction(e -> handleWhack(coord));
                buttons[row][col] = new SimpleStringProperty("");
                button.textProperty().bind(buttons[row][col]);

                buttonGrid.add(button, col, row);
            }
        }
    }

    private void nextTurn() {
//        if (mole.isVisible()) {
//            // hide mole from previous location
//            Coord origin = mole.getLastKnownLocation();
//            buttons[origin.getRow()][origin.getCol()].set("");
//
//            // show mole at new location
//            Coord dest = mole.getLocation();
//            buttons[dest.getRow()][dest.getCol()].set(">MOLE<");
//
//            // hide mole for next turn
//            mole.setVisible(false);
//        } else {
//            // determine destination
//            int destRow = rand.nextInt(this.board.getRowCount());
//            int destCol = rand.nextInt(this.board.getColCount());
//            BoardCell destCell = this.board.getCellAt(destRow, destCol);
//
//            // update mole
//            mole.move(destCell);
//            mole.setVisible(true);
//        }
    }
}

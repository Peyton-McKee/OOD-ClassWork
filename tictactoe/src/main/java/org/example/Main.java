package org.example;

import javafx.application.Application;
import javafx.stage.Stage;
import org.example.controllers.Controller;
import org.example.models.Board;
import org.example.views.View;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends Application {
    /**
     * Starts the GUI for a game of Whack-A-Mole.
     *
     * @param stage the JavaFX stage to add elements to
     */
    @Override
    public void start(Stage stage) {
        Board board = new Board();
        Controller controller = new Controller(board);
        View view = new View(controller);
        try {
            stage.setScene(view.load());
            controller.run();
            stage.setTitle("Whack a Mole");
            stage.show();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Entry point for a game of Whack-a-Mole.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch();
    }
}
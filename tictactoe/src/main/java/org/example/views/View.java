package org.example.views;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import org.example.controllers.Controller;

import java.io.IOException;

/**
 * Represents a simple Whack-a-Mole GUI view.
 */
public class View extends GridPane {
    FXMLLoader loader;

    /**
     * constructor
     * @param controller the controller to manage events
     */
    public View(Controller controller) {
        // initialization and location setting omitted for brevity
        this.loader = new FXMLLoader();
        this.loader.setLocation(getClass().getClassLoader().getResource("tictactoe.fxml"));
        this.loader.setController(controller);
    }

    /**
     * Loads a scene from a Whack-a-Mole GUI layout.
     *
     * @return the layout
     */
    public Scene load() throws IllegalStateException {
        // load the layout
        try {
            return this.loader.load();
        } catch (IOException exc) {
            throw new IllegalStateException("Unable to load layout.");
        }
    }
}

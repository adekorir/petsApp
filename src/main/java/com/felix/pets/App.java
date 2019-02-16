package com.felix.pets;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane root = new BorderPane(new Label("Start"));
        stage.setScene(new Scene(root, 400, 30));
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
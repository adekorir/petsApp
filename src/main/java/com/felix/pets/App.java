package com.felix.pets;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane root = new MainPane();
        root.setPadding(new Insets(10));
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Pets Application");
        stage.show();
    }
}
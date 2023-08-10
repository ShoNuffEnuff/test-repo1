package com.example.demo2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
<<<<<<< HEAD
<<<<<<< HEAD
        stage.setTitle("Victory is mine!");
=======
        stage.setTitle("Whoa Stuff!");
>>>>>>> parent of 9c3e555 (Adding Files to amend project structure.)
=======
        stage.setTitle("Whoa Stuff!");
>>>>>>> parent of 9c3e555 (Adding Files to amend project structure.)
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
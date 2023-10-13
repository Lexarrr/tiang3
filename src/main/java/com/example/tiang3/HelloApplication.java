package com.example.tiang3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Площадь треугольников");
        stage.setScene(scene);
        stage.show();


//
//        Group g = new Group();
//
//        FileChooser fileChooser = new FileChooser();
//
//        Button button = new Button("Select File");
//        g.getChildren().add(button);
//
//        button.setOnAction(e -> {
//            fileChooser.setInitialDirectory(new File("C:\\Users\\Etc21\\IdeaProjects\\Trin3"));
//            fileChooser.setTitle("select file");
//            fileChooser.getExtensionFilters().addAll(
//                    new FileChooser.ExtensionFilter("Text Files", "*.txt")
//
//            );
//            fileChooser.showOpenDialog(stage);
//
//        });

    }

    public static void main(String[] args) {
        launch();
    }
}
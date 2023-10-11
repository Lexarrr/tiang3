package com.example.tiang3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.util.Scanner;

public class HelloController {

    @FXML
    TextField tf1;

    @FXML
    Label textHead;

    @FXML
    Label resFile;

    @FXML
    Label trinRes;
    @FXML
    protected void chooseFile(){
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser
                                                .ExtensionFilter("TXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);
        fileChooser.setInitialDirectory(new File("C:\\Users\\Etc21\\IdeaProjects\\tiang3"));
        File file = fileChooser.showOpenDialog(new Stage());
        String name = String.valueOf(file);
        String s = name.replaceAll("\\\\", "/");
        resFile.setText(s);

    }

    @FXML
    protected void toClickNCalc() throws IOException {

        Scanner bis = new Scanner(new File(String.valueOf(resFile)));
        String s = bis.nextLine();
        Triangle t = Triangle.parseTr(s);

        trinRes.setText(String.valueOf(t.getArea()));
        String[] a = new String[]{};

    }

}
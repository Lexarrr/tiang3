package com.example.tiang3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class HelloController {

    double getPath(String pathO) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(pathO));
        String s;
        s = sc.nextLine();
        Triangle t = Triangle.parseTr(s);

        return t.getArea();
    }

    double getPaTrin(String p) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(p));
        String s;
        ArrayList<Triangle> trin = new ArrayList<>();
        while (sc.hasNext()) {
            s = sc.nextLine();

            Triangle t = Triangle.parseTr(s);
            trin.add(t);
        }
        int c = 0;
        for (int i = 0; i < trin.size(); i++) {
            c += (int) trin.get(i).getArea();
        }

        return c;
    }

    @FXML
    TextField tf1;

    @FXML
    Label textHead;

    @FXML
    Label resFile;

    @FXML
    Label trinRes;

    @FXML
    protected void chooseFile() {

        DirectoryChooser chooser = new DirectoryChooser();
        chooser.setTitle("JavaFX Projects");
        File defaultDirectory = new File("c:/dev/javafx");
        chooser.setInitialDirectory(defaultDirectory);
//        File selectedDirectory = chooser.showDialog(new Stage());

        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser
                .ExtensionFilter("TXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);
        fileChooser.setInitialDirectory(new File(String.valueOf(defaultDirectory)));
        File file = fileChooser.showOpenDialog(new Stage());
        String name = String.valueOf(file);
        String s = name.replaceAll("\\\\", "/");
        resFile.setText(s);

    }



    @FXML
    protected void toClickNCalc() throws IOException {

        Scanner sc = new Scanner(new File(trinRes.getText()));
        String s;
        s = sc.nextLine();
        Triangle t = Triangle.parseTr(s);

    }

    @FXML
    protected void toClickCalcTree() throws FileNotFoundException {

        Scanner sc = new Scanner(new File(trinRes.getText()));
        String s;
        ArrayList<Triangle> trin = new ArrayList<>();
        while (sc.hasNext()) {
            s = sc.nextLine();

            Triangle t = Triangle.parseTr(s);
            trin.add(t);
        }
        int c = 0;
        for (int i = 0; i < trin.size(); i++) {
            c += (int) trin.get(i).getArea();
        }

    }


}
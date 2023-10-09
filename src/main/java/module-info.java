module com.example.tiang3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tiang3 to javafx.fxml;
    exports com.example.tiang3;
}
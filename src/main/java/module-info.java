module com.example.demofx {
    requires javafx.controls;
    requires javafx.fxml;


    exports com.example.demofx.LE03;
    opens com.example.demofx.LE03 to javafx.fxml;
}
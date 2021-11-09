module com.example.demofx {
    requires javafx.controls;
    requires javafx.fxml;


    exports com.example.demofx.LE03;
    opens com.example.demofx.LE03 to javafx.fxml;
    exports com.example.demofx.LE03.Task3_HelloWorld;
    opens com.example.demofx.LE03.Task3_HelloWorld to javafx.fxml;
    exports com.example.demofx.LE03.Task4_DialogLayout;
    opens com.example.demofx.LE03.Task4_DialogLayout to javafx.fxml;
}
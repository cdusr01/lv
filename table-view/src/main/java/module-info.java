module com.example.tableview {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tableview to javafx.fxml;
    opens com.example.tableview.controller to javafx.fxml;
    exports com.example.tableview;
}
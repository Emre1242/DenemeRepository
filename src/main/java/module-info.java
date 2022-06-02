module com.example.projectnt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projectnt to javafx.fxml;
    exports com.example.projectnt;
}
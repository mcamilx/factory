module co.edu.uniquindio.factory {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.factory to javafx.fxml;
    exports co.edu.uniquindio.factory;
}
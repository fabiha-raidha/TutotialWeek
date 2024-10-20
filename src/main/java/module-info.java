module oop.tutorialjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens oop.tutorialjava to javafx.fxml;
    exports oop.tutorialjava;
}
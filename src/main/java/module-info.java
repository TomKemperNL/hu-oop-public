module nl.hu.oop {
    requires javafx.controls;
    requires javafx.fxml;

    opens nl.hu.oop to javafx.fxml;
    exports nl.hu.oop;
}

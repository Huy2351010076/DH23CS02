module com.mycompany.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens com.mycompany.quizapp to javafx.fxml;
    exports com.mycompany.quizapp;
}

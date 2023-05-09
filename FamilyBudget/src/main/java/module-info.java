module com.maksym.familybudget {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.maksym.familybudget to javafx.fxml;
    exports com.maksym.familybudget;
}
package com.maksym.familybudget;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import static java.lang.Integer.parseInt;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    @FXML
    private TextField enterField;

    DataSingleton data = DataSingleton.getInstance();

    @FXML
    private Button sendButton;

    public void submit(ActionEvent event) throws IOException {
        data.setEnterField(parseInt(enterField.getText()));

        Stage stage = (Stage) enterField.getScene().getWindow();
        Parent root = FXMLLoader.load((Objects.requireNonNull(getClass().getResource("result.fxml"))));
        stage.setTitle("Result of calculation");
        stage.setScene(new Scene(root));
    }

}

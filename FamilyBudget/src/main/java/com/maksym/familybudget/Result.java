package com.maksym.familybudget;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Result implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Distribution> table;

    @FXML
    private TableColumn<Distribution, Integer> tableEat;

    @FXML
    private TableColumn<Distribution, Integer> tableFuel;

    @FXML
    private TableColumn<Distribution, Integer> tableHygiene;

    @FXML
    private TableColumn<Distribution, Integer> tableSafetyPillow;

    @FXML
    private TableColumn<Distribution, Integer> tableStudy;

    DataSingleton data = DataSingleton.getInstance();
    @FXML
    void initialize() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tableEat.setCellValueFactory(new PropertyValueFactory<Distribution, Integer>("Eat"));
        tableHygiene.setCellValueFactory(new PropertyValueFactory<Distribution, Integer>("Hygiene"));
        tableStudy.setCellValueFactory(new PropertyValueFactory<Distribution, Integer>("Study"));
        tableFuel.setCellValueFactory(new PropertyValueFactory<Distribution, Integer>("Fuel"));
        tableSafetyPillow.setCellValueFactory(new PropertyValueFactory<Distribution, Integer>("SafetyPillow"));
        table.setItems(getDistributionsList());
    }
    ObservableList<Distribution> getDistributionsList(){
        ObservableList<Distribution> distributions = FXCollections.observableArrayList();
        distributions.add(new Distribution(data.getEnterField() * 25 / 100, data.getEnterField() * 20 / 100,data.getEnterField() * 15 / 100,data.getEnterField() * 30 / 100,data.getEnterField() * 10 / 100));
        return distributions;
    }
 }

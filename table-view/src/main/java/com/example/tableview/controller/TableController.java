package com.example.tableview.controller;

import com.example.tableview.model.Employee;
import com.example.tableview.model.Manager;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

import static com.example.tableview.util.Mng.dataList;

public class TableController implements Initializable {

    @FXML
    private TableColumn<Employee, Number> tableColumnSale;

    @FXML
    private TableView<Employee> tableView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        createManager();
        loadManager();
        setCellValueFactories();
    }

    private void setCellValueFactories() {
        tableColumnSale.setCellValueFactory(i -> new SimpleDoubleProperty(i.getValue().getS()));
    }

    private void loadManager() {
        tableView.getItems().clear();
        for (Employee p : dataList) {
            tableView.getItems().add(p);
        }
    }

    private void createManager() {
        Employee p;
        for (int i = 0; i < 15; i++) {
            p = new Manager();
            p.setS(p.zarpl());
            dataList.add(p);
        }
    }
}

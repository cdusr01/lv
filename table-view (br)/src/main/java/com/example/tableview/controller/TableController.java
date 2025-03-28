package com.example.tableview.controller;

import com.example.tableview.model.Employee;
import com.example.tableview.model.Manager;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.example.tableview.util.Mng.dataList;

public class TableController implements Initializable {

    @FXML
    private TableColumn<Employee, Number> tableColumnSale;

    @FXML
    private TableColumn<Employee, String> tableColumnName;

    @FXML
    private TableView<Employee> tableView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        createManager();
        loadManager();
        setCellValueFactories();
    }

    private void setCellValueFactories() {
        tableColumnName.setCellValueFactory(i -> new SimpleStringProperty(i.getValue().getName()));
        tableColumnSale.setCellValueFactory(i -> new SimpleDoubleProperty(i.getValue().getS()));
    }

    private void loadManager() {
        tableView.getItems().clear();
        for (Employee p : dataList) {
            tableView.getItems().add(p);
        }
    }

    private void createManager() {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\txt.txt"))) {
            Employee p;
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(";");
                p = new Manager(Double.parseDouble(words[1]), words[0]);
                dataList.add(p);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

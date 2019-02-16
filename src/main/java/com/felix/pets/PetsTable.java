package com.felix.pets;

import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PetsTable extends TableView<Pet> {

    public PetsTable(ObservableList<Pet> data) {
        super(data);
        
        TableColumn<Pet, String> colName = new TableColumn<>("Name");
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        getColumns().add(colName);

        TableColumn<Pet, String> colOwner = new TableColumn<>("Owner");
        colName.setCellValueFactory(new PropertyValueFactory<>("owner"));
        getColumns().add(colOwner);

        TableColumn<Pet, String> colSpecies = new TableColumn<>("Species");
        colName.setCellValueFactory(new PropertyValueFactory<>("species"));
        getColumns().add(colSpecies);

        TableColumn<Pet, String> colSex = new TableColumn<>("Sex");
        colName.setCellValueFactory(new PropertyValueFactory<>("sex"));
        getColumns().add(colSex);

        TableColumn<Pet, String> colBirth = new TableColumn<>("Birth");
        colName.setCellValueFactory(new PropertyValueFactory<>("birth"));
        getColumns().add(colBirth);

        TableColumn<Pet, String> colDeath = new TableColumn<>("Death");
        colName.setCellValueFactory(new PropertyValueFactory<>("death"));
        getColumns().add(colDeath);

    }
}

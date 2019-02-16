package com.felix.pets;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class MainPane extends BorderPane {

    private ObservableList<Pet> data;

    public MainPane() {
        data = FXCollections.observableArrayList();

        final PetsTable table = new PetsTable(data);

        Label lblInstructions = new Label("Click on refresh to refresh the table, Cancel to exit");
        lblInstructions.setFont(Font.font("monospaced", FontWeight.BOLD, FontPosture.REGULAR, 14));

        final Button btnRefresh = new Button("Refresh");
        btnRefresh.setOnAction(event -> this.refresh());
        btnRefresh.setDefaultButton(true);

        final Button btnCancel = new Button("Cancel");
        btnCancel.setOnAction(event -> Platform.exit());
        btnCancel.setCancelButton(true);

        ButtonBar buttonBar = new ButtonBar(ButtonBar.BUTTON_ORDER_WINDOWS);
        buttonBar.setButtonMinWidth(70);
        buttonBar.getButtons().addAll(btnRefresh, btnCancel);

        this.setTop(lblInstructions);
        this.setCenter(table);
    }

    private void refresh() {
        data.clear();
        data.addAll(new PetsRepository().getAll());
    }
}

package com.example.javafx_gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioButton;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button clearingMemory;

    @FXML
    private Button connectTheDevice;

    @FXML
    private RadioButton duplicateInformationEEPROM;

    @FXML
    private Button loadConfig;

    @FXML
    private MenuButton portSelection;

    @FXML
    private Button readingFile;

    @FXML
    private Button readingInformation;

    @FXML
    private Button resetSettings;

    @FXML
    private Button updatePO;

    @FXML
    private Button сhoosePath;

    @FXML
    void initialize() {

        clearingMemory.setOnAction(event -> {
            System.out.println("HELLOOOOOOOOOOOOOOOOOOOO");
        });
        connectTheDevice.setOnAction(event -> {});
        duplicateInformationEEPROM.setOnAction(event -> {});
        loadConfig.setOnAction(event -> {});
        portSelection.setOnAction(event -> {});
        readingFile.setOnAction(event -> {});
        readingInformation.setOnAction(event -> {});
        resetSettings.setOnAction(event -> {});
        updatePO.setOnAction(event -> {});
        сhoosePath.setOnAction(event -> {});


    }

}


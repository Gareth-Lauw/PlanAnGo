package controller;

import java.io.Serializable;
import com.sun.tools.javac.Main;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import models.Deadline;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.Scanner;

public class AddNewDeadlineController implements Initializable {

    @FXML
    private AnchorPane anchorPaneAddNewDeadline;

    @FXML
    private TextField ScannerName;

    @FXML
    private TextField ScannerDeadline;

    @FXML
    private TextField ScannerStartingDate;

    @FXML
    private TextField ScannerPriorityLevel;

    @FXML
    private TextArea ScannerNotes;


    public void BackToMainMenu(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getClassLoader().getResource("MainMenuReal.fxml"));
        anchorPaneAddNewDeadline.getChildren().setAll(pane);

    }


    public void NewDeadline() throws ParseException, IOException {

        String startingDateString =  ScannerStartingDate.getText();
        Date startingDateDate = new SimpleDateFormat("dd/MM/yyyy").parse(startingDateString);

        String deadlineDateString =  ScannerDeadline.getText();
        Date deadlineDateDate= new SimpleDateFormat("dd/MM/yyyy").parse(deadlineDateString);

        String priorityLevelString =  ScannerPriorityLevel.getText();
        int priorityLevelInt = Integer.parseInt(priorityLevelString);

        String notes = ScannerNotes.getText();


        Deadline deadline = new Deadline(ScannerName.getText(), deadlineDateDate, startingDateDate, priorityLevelInt, ScannerNotes.getText());



        AnchorPane pane = FXMLLoader.load(getClass().getClassLoader().getResource("MainMenuReal.fxml"));
        anchorPaneAddNewDeadline.getChildren().setAll(pane);



    }





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}

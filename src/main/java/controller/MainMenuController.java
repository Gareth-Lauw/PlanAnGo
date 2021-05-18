package controller;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import models.Deadline;

import java.awt.*;
import java.awt.color.ProfileDataException;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;

public class MainMenuController implements Initializable {

    private TableView table = new TableView();

    @FXML
    private AnchorPane anchorPaneMainMenu;

    @FXML
    private TableView<Deadline> tableView;

    @FXML
    private TableColumn<Deadline, String> projectNameColumn;

    @FXML
    private TableColumn<Deadline, Integer> priorityLevelColumn;

    @FXML
    private TableColumn<Deadline, Date> startingDateColumn;

    @FXML
    private TableColumn<Deadline, Date> deadlineColumn;

    public void manageDeadlines(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getClassLoader().getResource("ManageDeadlines.fxml"));
        anchorPaneMainMenu.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        projectNameColumn.setCellValueFactory(new PropertyValueFactory<Deadline, String>("projectName"));
        priorityLevelColumn.setCellValueFactory(new PropertyValueFactory<Deadline, Integer>("priorityLevel"));
        startingDateColumn.setCellValueFactory(new PropertyValueFactory<Deadline, Date>("startingDate"));
        deadlineColumn.setCellValueFactory(new PropertyValueFactory<Deadline, Date>("deadline"));

        tableView.setItems(getDeadline());

}

    public ObservableList<Deadline> getDeadline() {

        ObservableList<Deadline> deadline = FXCollections.observableArrayList();
        deadline.add(AddNewDeadlineController.newProject);

        return deadline;
    }


}
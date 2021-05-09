package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ManageDeadlineController implements Initializable {

    @FXML
    private AnchorPane anchorPaneManageDeadlineMenu;

        public void AddANewDeadline(MouseEvent mouseEvent) throws IOException {
            AnchorPane anchorPane = FXMLLoader.load(getClass().getClassLoader().getResource("AddNewDeadline.fxml"));
            anchorPaneManageDeadlineMenu.getChildren().setAll(anchorPane);
        }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void backToMainMenuManageDeadlines(MouseEvent mouseEvent) throws IOException {
            AnchorPane pane = FXMLLoader.load(getClass().getClassLoader().getResource("MainMenuReal.fxml"));
        anchorPaneManageDeadlineMenu.getChildren().setAll(pane);
        }

    }


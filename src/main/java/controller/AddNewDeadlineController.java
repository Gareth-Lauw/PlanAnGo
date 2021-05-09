package controller;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddNewDeadlineController implements Initializable {

    @FXML
    private AnchorPane anchorPaneAddNewDeadline;

    public void BackToMainMenu(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getClassLoader().getResource("MainMenuReal.fxml"));
        anchorPaneAddNewDeadline.getChildren().setAll(pane);

    }


  //  public void DeadlineNameAdder() {

   //     ObservableList<Node> listDeadlines = anchorPaneAddNewDeadline.getChildren();

    //    for (int i = 0; i < listDeadlines.size(); i++) {
   //         if(listDeadlines.size(i) == anchorPaneAddNewDeadline.getId(ScannerName)){
//
   //         }


    //    }
 //   }





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}

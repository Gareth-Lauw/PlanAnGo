import controller.AddNewDeadlineController;
import models.Deadline;
import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println(Deadline.allDeadlines);


        System.out.println("Credits: Joey & Zoë");

        JavaFXApp.main(args);

        System.out.println(Deadline.allDeadlines);



    }


}


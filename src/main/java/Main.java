import controller.AddNewDeadlineController;
import models.Deadline;
import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        addSavedDeadlineObjects();

        System.out.println("Credits: Joey & Zoë");

        JavaFXApp.main(args);


        fileWriterDeadline();

    }

    public static void fileWriterDeadline() throws IOException {

        try {

            FileOutputStream writeData = new FileOutputStream("Deadlines.txt");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(Deadline.allDeadlines);
            writeStream.flush();
            writeStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addSavedDeadlineObjects() {

        try {
            FileInputStream readData = new FileInputStream("Deadlines.txt");
            ObjectInputStream readStream = new ObjectInputStream(readData);

            ArrayList<Deadline> newDeadlineList = (ArrayList<Deadline>) readStream.readObject();
            readStream.close();

            if(!newDeadlineList.isEmpty()) {
                for (Deadline deadline : newDeadlineList) {
                    Deadline.allDeadlines.add(deadline);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


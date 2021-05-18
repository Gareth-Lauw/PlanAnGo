package models;
import javafx.beans.property.*;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;

public class Deadline implements Serializable {

    private static final long serialVersionUID = -7519580796466356457L;

    private int deadlineId;
    private SimpleStringProperty name;
    private ObjectProperty<Date> deadline;
    private ObjectProperty<Date> startingDate;
    private SimpleIntegerProperty priorityLevel;
    private SimpleBooleanProperty done;

   public static ArrayList<Deadline> allDeadlines = new ArrayList<>();

    public Deadline(String name, Date deadline, Date startingDate, int priorityLevel, String notes) {

        this.name = new SimpleStringProperty(name);
        this.deadline = new SimpleObjectProperty<>(this, "deadline", deadline);
        this.startingDate = new SimpleObjectProperty<>(this, "startingDate", startingDate);
        this.priorityLevel = new SimpleIntegerProperty(priorityLevel);
        this.done = done;
        this.allDeadlines = allDeadlines;

        if(allDeadlines.isEmpty()) {
            this.deadlineId = 1;
        } else {
            int lastId = allDeadlines.get(allDeadlines.size() -1 ).getDeadlineId();
            this.deadlineId = lastId + 1;
        }

        allDeadlines.add(this);

    }

    public int getDeadlineId() {
        return deadlineId;
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name = new SimpleStringProperty(name);
    }

    public Date getDeadline() {
        return deadline.get();
    }

    public ObjectProperty<Date> deadlineProperty() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline.set(deadline);
    }

    public Date getStartingDate() {
        return startingDate.get();
    }

    public ObjectProperty<Date> startingDateProperty() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate.set(startingDate);
    }

    public int getPriorityLevel() {
        return priorityLevel.get();
    }

    public SimpleIntegerProperty priorityLevelProperty() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel.set(priorityLevel);
    }

    public void deleteDeadline(){

    }
}

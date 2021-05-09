package models;

import java.util.ArrayList;
import java.util.Date;

public class Deadline {
    private String name;
    private Date deadline;
    private Date startingDate;
    private int priorityLevel;
    private Boolean done;

   public static ArrayList<Deadline> allDeadlines = new ArrayList<Deadline>();

    public Deadline(String name, Date deadline, Date startingDate, int priorityLevel, Boolean done, ArrayList<Deadline> allDeadlines) {

        this.name = name;
        this.deadline = deadline;
        this.startingDate = startingDate;
        this.priorityLevel = priorityLevel;
        this.done = done;
        this.allDeadlines = allDeadlines;

        allDeadlines.add(this);
    }

    public Deadline(String name, Date deadlineDate, Date startingDate) {

    }


    public void deleteDeadline(){

    }
}

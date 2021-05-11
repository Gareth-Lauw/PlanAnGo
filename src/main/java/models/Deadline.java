package models;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;

public class Deadline implements Serializable {

    private static final long serialVersionUID = -7519580796466356457L;

    private String name;
    private Date deadline;
    private Date startingDate;
    private int priorityLevel;
    private Boolean done;

   public static ArrayList<Deadline> allDeadlines = new ArrayList<Deadline>();

    public Deadline(String name, Date deadline, Date startingDate, int priorityLevel, String notes) {

        this.name = name;
        this.deadline = deadline;
        this.startingDate = startingDate;
        this.priorityLevel = priorityLevel;
        this.done = done;
        this.allDeadlines = allDeadlines;

        allDeadlines.add(this);
    }


    public void deleteDeadline(){

    }
}

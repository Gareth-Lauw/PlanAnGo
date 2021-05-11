import models.Deadline;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static models.Deadline.allDeadlines;

class JavaFXAppTest {

    @Test
    public void dummyTest(){

        int expected = 0;
        int actual = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEquivalenteWaarde(){

        int EquivalenteWaarde = 0;


        if (EquivalenteWaarde >= 5 || EquivalenteWaarde <= 10){
            System.out.println("Heeft deadlines afgerond maar nog geen besluit over de nuttigheid.");
        }
        else if (EquivalenteWaarde > 10  || EquivalenteWaarde <= 15){
            System.out.println("Heeft deadlines afgerond, enigszins is er vooruitgang.");
        }

        else if (EquivalenteWaarde > 15){
            System.out.println("Heeft veel deadlines afgerond, Er is veel vooruitgang geboekt en Plan&Go is een succes.");
        }

    }

    @Test
    public void testDeadlineCorrectlyFilled() throws ParseException {

        Boolean expectedIngevuldeDeadline = true;
        Boolean filled = false;
        int expectedNumber = 0;
        int actualNumber = 0;


        Scanner scanner = new Scanner(System.in);


        System.out.println("Geef de deadline zijn naam");
        String name = "Something";

        System.out.println("Geef de eind datum:");
        String deadlineDate = "02/02/2020";

        System.out.println("Geef de begin datum:");
        String startingDate = "06/02/2020";

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(startingDate);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(deadlineDate);

        Deadline deadline = new Deadline( name, date2, date1);

        allDeadlines.add(deadline);

        if (allDeadlines.size() -1 != allDeadlines.size()){
            filled = true;
        }

        Assertions.assertEquals(expectedIngevuldeDeadline, filled);
        Assertions.assertEquals(expectedNumber, actualNumber);

    }

    @Test
    public boolean pairWiseTestOptions() {

        String naam = "something";
        String startingDate = "06/02/2020";
        String deadlineDate = "02/02/2020";
        String note = "Hello world";

        if (naam != null && startingDate != null && deadlineDate != null && note != null) {
            return true;
        } else {
            return false;
        }


    }



}

package Application;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static inc CURRENT_YEAR=2026;

    public static void main (String[] args) {

        final String GREETING_MESSGE = "Saludo estudiantes de java";

        String[] namesStudents = {"Juan", "Maria", "Pedro", "Ana", "Luis"};
        int[] birthYears = {2000, 1998, 2002, 1995, 2001};

        List<int[]> ageStudentList = new ArrayList<>();
        showMessage(GREETING_MESSGE);

    }

     static void showMessage(String message) {
         System.out.println(message);
     }

     static int calculateAge (int birthYear) {
         return CURRENT_YEAR - birthYear;
     }



    }
}

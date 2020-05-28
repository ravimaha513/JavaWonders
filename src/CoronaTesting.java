import java.sql.Connection;
import java.util.Arrays;
import java.util.Scanner;

public class CoronaTesting {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the person's age:");
        int personAge = scan.nextInt();

        System.out.println("Enter Symptoms: ");
        String symptoms = scan.next();
        if(checkAgeGroupForAttention(personAge)){
            System.out.println(checkForSymptoms(symptoms.split(",")));
        }


    }


    public static boolean checkAgeGroupForAttention(int perAge){
        if(perAge <= 10 || perAge>= 50){
            return true;
        }
        else if(perAge >10 && perAge <50){
            return false;
        }

        return false;
    }

    public static boolean checkForSymptoms(String[] symptoms){
        System.out.println(symptoms);
        String[] checklist = new String[]{"cold","bodyAches"};
        if(Arrays.deepEquals(symptoms, checklist)){
            return true;
        }

        return false;
    }


}

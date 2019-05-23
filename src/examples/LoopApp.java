package examples;

import java.util.Scanner;

public class LoopApp {
    public static void main(String[] nevermore) {
        /*
        for (int i = 0; i < 10; i++){
            System.out.print(i + "\n");
        }

        Scanner sc = new Scanner(System.in);
        String reponse = "";
        while(!reponse.equals("y") && !reponse.equals("n")){
        // .equals behaves like "=="
            System.out.print("Do you accept [y/n]: \n ");
            reponse = sc.next();

            if (!reponse.equals("y") && !reponse.equals("n")){
                System.out.println("You must answer y or n \n");
            }
        }
        if (reponse.equals("y")){
            System.out.println("You will be assimilated.");
        } else {
            System.out.println("Resistance is futile.");
        }
        */

        Scanner sc = new Scanner(System.in);
        String reponse = "";
        do {
            System.out.print("Do you accept [y/n]: \n ");
            reponse = sc.next();

        } while(!reponse.equals("y") && !reponse.equals("n"));
            System.out.println("Thank you!");
    }
}

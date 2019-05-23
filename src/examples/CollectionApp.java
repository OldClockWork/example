package examples;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionApp {

    public static void main(String[] TIME){
    /*
        int values[] = {1, 2, 3};

        values[0] = 200;

        for(int x : values) { //Assigns each value in the array to "x" one at a time before moving to the next one when it loops.
            System.out.println(x);

        } */

        ArrayList<Integer> myList = new ArrayList<>(); //This type of Array can be expended on.

        /*
        myList.add(5); //Code does as it implies. Add the values to the assigned ArrayList above.
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        */

        /*
        for(int i = 1; i < 11; i++){
            myList.add(i);
        } */

        /*
        myList.remove(new Integer(5));

        for (Integer x : myList){
            System.out.println(x);

        }

         */

        HashMap<Integer, String> days = new HashMap<>();
        days.put(0, "Sunday");
        days.put(1, "Monday");
        days.put(2, "Tuesday");

        for (HashMap.Entry<Integer, String> entry : days.entrySet()){
            System.out.println(entry.getKey().toString()+ ", " + entry.getValue());
        }
    }
}

package studio;

import java.awt.geom.NoninvertibleTransformException;
import java.util.ArrayList;
import java.util.HashMap;

public class CountingCharacters {

    static void HashMapMethod(String text){

        HashMap<Character, Integer> counts = new HashMap<>(100);

        for (char c : text.toCharArray()){
            Integer new_count = counts.getOrDefault(c, 0) + 1;
            counts.put(c, new_count);
            // getOrDefault checks if the HashMap contains the set. If it does then the code above adds 1 to it.
            // If it doesn't then 1 is added to a new set which is added to the HashMap.
        }

        for (HashMap.Entry<Character, Integer> entry : counts.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());

        }
    }

    static void arrayMethod(String text){
        int[] counts = new int[128];


        for (char c: text.toCharArray()){
            counts[c]++;
           }

        for (char c = 0; c < 128; c++){
            Integer count = counts[c];
            if (count > 0){
                System.out.println(c + ": " + count);
            }
        }

    }


    static void listMethod(String text){
        ArrayList<Integer> counts = new ArrayList<>();

        for (int i = 0; i < 128; i++){
            counts.add(0);
        }

        for (char c: text.toCharArray()){
            int new_count = counts.get(c) + 1;
            counts.set(c, new_count);

        }

        for (char c = 0; c < 128; c++){
            Integer count = counts.get(c);
            if (count > 0){
                System.out.println(c + ": " + count);
            }
        }

    }



    public static void main(String[] SLEEP) {

        String Poem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. " +
                "Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, " +
                "dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        arrayMethod(Poem);

        /* -------------------

        HashMap<Character, Integer> charCount = new HashMap<>();


        for (char i : Poem.toCharArray()) {

            if (charCount.containsKey(i)){
                Integer count = charCount.get(i);
                charCount.put(i,count+1);
            } else {
                charCount.put(i,1);
            }
        }
        for (HashMap.Entry<Character,Integer> entry : charCount.entrySet()){
            System.out.println((entry.getKey().toString()+ " " + entry.getValue()));


        }
        ------------------- */
    }
}






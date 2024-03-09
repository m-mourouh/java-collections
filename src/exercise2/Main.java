package exercise2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> notes = new HashMap<>();
        // Add students and their notes to the map
        notes.put("John", 12.0);
        notes.put("Jane", 15.0);
        notes.put("Tom", 9.0);
        notes.put("Alice", 17.0);
        notes.put("Bob", 7.0);
        System.out.println("==========================Students List============================");
        notes.forEach((k,v) -> System.out.println(k + " = " + v));
        // Change Tom's note
        notes.put("Tom", 10.0);
        System.out.println("==========================Students List============================");
        notes.forEach((k,v) -> System.out.println(k + " = " + v));
        // Remove a student from the map
        notes.remove("Bob");
        System.out.println("==========================Students List============================");
        notes.forEach((k,v) -> System.out.println(k + " = " + v));


        //Display Map's size
        System.out.println("Size = " + notes.size());

        System.out.println("==========================Operations============================");
        //Display Min, Max, Avg of notes
        System.out.println("Min = " + notes.values().stream().min(Double::compare).get());
        System.out.println("Max = " + notes.values().stream().max(Double::compare).get());
        System.out.println("Avg = " + notes.values().stream().reduce((double) 0, Double::sum) / notes.size());

        System.out.println("==========================Checking============================");
        //Check if there is any note == 20
        System.out.println("Does `notes` contains 20: " + notes.containsValue(20));
    }
}

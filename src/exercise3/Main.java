package exercise3;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> groupeA = new HashSet<>();
        HashSet<String> groupeB = new HashSet<>();

        //Add students names to groupeA
        groupeA.add("Ahmed");
        groupeA.add("Rachid");
        groupeA.add("Mariam");
        groupeA.add("John");
        groupeA.add("Mark");

        //Display groupeA
        System.out.println("Groupe A: " + groupeA);

        //Add students names to groupeB
        groupeB.add("Ahmed");
        groupeB.add("Alexis");
        groupeB.add("Mariam");
        groupeB.add("Markos");
        groupeB.add("Alexandre");

        //Display groupeB
        System.out.println("Groupe B: " + groupeB);

        //Intersection between groupeA and groupeB
        HashSet<String> intersection = new HashSet<>(groupeA);
        intersection.retainAll(groupeB);
        System.out.println("Intersection: " + intersection);

        //Union between groupeA and groupeB
        HashSet<String> union = new HashSet<>(groupeA);
        union.addAll(groupeB);
        System.out.println("Union: " + union);

    }
}

package activities;

import java.util.HashSet;
import java.util.Iterator;

public class Activity10 {
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<String>();
        hs.add("Rose");
        hs.add("Sunflower");
        hs.add("Lotus");
        hs.add("Marigold");
        hs.add("Daisy");
        hs.add("Lilly");

        System.out.println("Original HashSet: " + hs);

        System.out.println("Size of the HashSet: " + hs.size());

        hs.remove("Marigold");

        System.out.println("New HashSet: " + hs);

        try{
            if(hs.remove("Jasmine")) {
                System.out.println("Jasmine removed from the Set");
            } else {
                System.out.println("Jasmine is not present in the Set");
            }
        }catch (Exception e){
            System.out.println("Exception : " + e);
        }

        System.out.println("Checking if Lilly is present: " + hs.contains("Lilly"));

        System.out.println("Updated HashSet: " + hs);
    }
}

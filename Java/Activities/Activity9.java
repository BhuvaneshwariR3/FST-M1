package activities;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Activity9 {

    public static void main(String[] args){
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Rose");
        myList.add("Lilly");
        myList.add("Sunflower");
        myList.add("Daisy");
        myList.add("Lotus");

        System.out.println("Print all the values in the list: ");
        for(String s : myList){
            System.out.println(s);
        }

        System.out.println("Print the 3rd value in the list : " + myList.get(2));

        System.out.println("Check if Daisy flower is present in the list : " + myList.contains("Daisy"));

        System.out.println("Print the size of the list : " + myList.size());

        myList.remove("Sunflower");

        System.out.println("Print the new size of the list : " + myList.size());

    }

}

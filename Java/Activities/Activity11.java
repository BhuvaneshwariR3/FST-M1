package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args){
        HashMap<Integer, String> color = new HashMap<Integer, String>();
        color.put(1, "Red");
        color.put(2, "Green");
        color.put(3, "Yellow");
        color.put(4, "Orange");
        color.put(5, "Blue");

        System.out.println("The Original map: " + color);

        color.remove(3);

        System.out.println("The New map: " + color);

        if(color.containsValue("Green")) {
            System.out.println("Green exists in the Map");
        } else {
            System.out.println("Green does not exist in the Map");
        }

        System.out.println("Print the size of the Map: " + color.size());
    }
}

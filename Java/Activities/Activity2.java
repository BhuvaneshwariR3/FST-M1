package activities;

import java.lang.reflect.Array;

public class Activity2 {
    public static void main(String[] args){
        int[] arr = {10, 77, 10, 54, -11, 10};

        int searchNum = 10;
        int sum = 30;
        int searchSum = 0;

        for(int num : arr){
            if(num == searchNum){
                searchSum += searchNum;
            }
            if(searchSum > sum){
                break;
            }
        }

        System.out.println("Search Sum of the array values = "+ searchSum);

    }
}

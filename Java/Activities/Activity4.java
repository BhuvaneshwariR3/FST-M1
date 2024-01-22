package activities;

import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args){
        int[] arr = {4, 5, 3, 1, 7, 9, 2};
        Activity4 a = new Activity4();
        a.sortInAsec(arr);
        System.out.println("Sorted in Ascending order : " + Arrays.toString(arr));

    }
     public void sortInAsec(int[] arr){
        int size = arr.length;
        int i ;

        for(i=1 ; i<size ; i++){
            int val = arr[i];
            int j = i-1;

            while(j >= 0 && val < arr[j]){
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = val;
        }
    }
}

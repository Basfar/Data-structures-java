package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ReverseElements {


    public void reverseArray(int[] numbers, int start, int end){

        while(start < end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }

    }

    public void printArray(int[] arr){
        for(int i=0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}

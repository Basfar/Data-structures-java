import Arrays.AddOrUpdateElement;
import Arrays.RemoveEvenInteger;
import Arrays.ReverseElements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        AddOrUpdateElement arr = new AddOrUpdateElement();
//        arr.arrayDemo();

        int[] myArray = {3,2,4,6,7,8,10,5};

//        RemoveEvenInteger arr = new RemoveEvenInteger();
//        int[] result = arr.removeEven(myArray);

        ReverseElements arr = new ReverseElements();
        arr.printArray(myArray);
        arr.reverseArray(myArray, 0, myArray.length -1);
        arr.printArray(myArray);

    }
}
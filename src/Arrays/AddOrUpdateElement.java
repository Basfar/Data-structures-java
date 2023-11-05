package Arrays;

public class AddOrUpdateElement {

    public void printArray(int[] arr){
        for(int i=0;i < arr.length;i++){
            System.out.println(arr[i] + " ");
        }

        System.out.println();
    }


    public void arrayDemo(){
        int[] myArray = new int[5];
        myArray[0] = 5;
        myArray[1] = 3;
        myArray[2] = 6;
        myArray[3] = 8;
        myArray[4] = 10;

        printArray(myArray);
        System.out.println(myArray.length);
        System.out.println(myArray[myArray.length - 1]);

        int[] arr = {4,5,6,7};
        printArray(arr);
    }
}

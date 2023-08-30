package Arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[4] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[1]);

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("First = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println(arrayLength);
        System.out.println(firstTen[firstTen.length - 1]);

         int[] newArray = new int[5];

        for(int i = 0;i < newArray.length;i++){
            newArray[i] = i;
            System.out.println(newArray[i]);
        }

        System.out.println("---------");

        for(int element : newArray){
            System.out.print(element + " ");
        }

        System.out.println(Arrays.toString(newArray));



    }
}

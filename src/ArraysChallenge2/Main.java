package ArraysChallenge2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] integers = readIntegers();
        System.out.println(Arrays.toString(integers));
        int minNumber = findMin(integers);
        System.out.println(minNumber);
    }
    private static String[] readIntegers(){
        System.out.println("Enter your numbers: ");
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        return numbers.split(",");


    }

    private static int findMin(String[] arr){
        int minNum = Integer.parseInt(arr[0]);
        for(int i = 0;i < arr.length;i++){
            int currentNumber = Integer.parseInt(arr[i]);
            if(currentNumber < minNum) minNum = currentNumber;
        }

        return minNum;
    };
}

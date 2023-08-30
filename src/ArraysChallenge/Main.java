package ArraysChallenge;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Generisi array sa random brojevima od 1 do 100
        Random random = new Random();
        int[] numArray = new int[10];
        for(int i = 0;i<numArray.length;i++){
            numArray[i] = random.nextInt(100);
        }
        //Napravi kopiju arraya i sortiraj elemente
        int[] sortedArray = Arrays.copyOf(numArray,numArray.length);
        Arrays.sort(sortedArray);
        System.out.println(Arrays.toString(sortedArray));
        //Napravi novi array koji ce imati ascending order tako sto ce zamijeniti brojeve na osnovu arraylength - index
        int[] inverseSort = new int[sortedArray.length];
        for(int i = 0;i < inverseSort.length;i++){
            inverseSort[i] = sortedArray[sortedArray.length - (i + 1)];
        }
        System.out.println(Arrays.toString(inverseSort));
    }
}

package ReverseArrayChallenge;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numArr = {1,2,3,4,5};
        System.out.println(Arrays.toString(numArr));
        reverse(numArr);
        System.out.println(Arrays.toString(numArr));
    }

    private static void  reverse(int[] array){
        int[] clone = Arrays.copyOf(array,array.length);
        for(int i = 0; i < array.length; i++){
            if(i == 0) {
            clone[0] = array[array.length - 1];
            continue;
            }
            clone[i] = array[array.length - (i + 1)];
        }

        for(int i = 0; i < array.length; i++){
            array[i] = clone[i];
        }

    }
}

package MultipleArrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        for (int[] element : array2) {
            System.out.println(Arrays.toString(element));
        }

        System.out.println(Arrays.deepToString(array2));
        /*
        for(int i = 0; i < array2.length; i++ ){
            var innerArray = array2[i];
            for(int j = 0; j < innerArray.length;j++){
                System.out.print(array2[i][j] + " ");
            }
        }
    }*/

        /*
        for(var outer :array2){
            for (var element :outer){
                System.out.print(element + " ");
            }
            System.out.println("ZAVRSIO SAM SA LOPPANJEM JEDNOG ARRAYA");
        }*/

    }
}

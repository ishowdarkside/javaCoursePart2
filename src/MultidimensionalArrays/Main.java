package MultidimensionalArrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Object[] anyArr = new Object[3];
        System.out.println(Arrays.toString(anyArr));

        anyArr[0] = new String[] {"A","B","C"};
        System.out.println(Arrays.deepToString(anyArr));

        anyArr[1] = new int[][] {{1,2,3},{4,5,6}};

        System.out.println(Arrays.deepToString(anyArr));
    }
}

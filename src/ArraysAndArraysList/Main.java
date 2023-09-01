package ArraysAndArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        String[] originalArray = new String[] {"First","Second","Third"};

        var originalList = Arrays.asList(originalArray);
        originalList.set(0,"one");

        originalList.sort(Comparator.naturalOrder());
        System.out.println(originalList);
        System.out.println(Arrays.toString(originalArray));

        List<String> newList = Arrays.asList("Sunday","Monday","Tuesday");
        System.out.println(newList);


*/

        int[] myNum = new int[] {1,2,3,4,5};
        System.out.println(Arrays.toString(myNum));
        var myNumList = Arrays.asList(myNum);
        ArrayList<String> myList = new ArrayList<>(List.of("TO","TEBE","NERVRIRA"));
        System.out.println(myList instanceof ArrayList);
    }
}

package ArrayListChallenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numArrList= new ArrayList<>(List.of("milk","apple"));
        while(true){
        System.out.println("Choose options: [0 - Quit program], [1 - Add items to list], " +
                " [3 - Remove items from list] ");
        String option = (scanner.nextLine());
        if(option.equals("0")) break;
        if(option.equals("1")){
            System.out.println("Added comma separated values you want to add");
            String[] valueArr = scanner.nextLine().split(",");

            for(String element : valueArr){
                if(numArrList.contains(element)) break;
                numArrList.add(element);
            }


        }
        if(option.equals("2")){
            System.out.println("Add comma separated values you want to remove");
            String[] values = scanner.nextLine().split(",");
            for(String element : values){
                numArrList.remove(element);
            }
        }
        numArrList.sort(Comparator.naturalOrder());
        System.out.println(numArrList);
        break;

        }

    }
}

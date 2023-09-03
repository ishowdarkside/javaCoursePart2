package LinkedListChallenge;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> placeName = new LinkedList<>(List.of("Adelaide","Alice Springs",
                "Brisbane","Darwin","Melbourne","Perth"));
        ListIterator placeNameIterator = placeName.listIterator();
        boolean isActive = true;
        Scanner scanner = new Scanner(System.in);
        while(isActive){

        System.out.println("Available actions (Select word or letter) \n" +
                "(F)orward\n" +
                "(B)ackward\n" +
                "(L)ist Place\n" +
                "(M)enu\n" +
                "(Q)uit");
        String input = scanner.nextLine().toUpperCase();
        if(input.equals("F")){
            if(placeNameIterator.hasNext()) System.out.println(placeNameIterator.next());
            else System.out.println("NO MORE NEXT ITEMS, TRY PRINTING PREVIOUS");
         }

        if(input.equals("B")){
            if(placeNameIterator.hasPrevious()) System.out.println(placeNameIterator.previous());
            else System.out.println("No previous elements, try printing next");
        }

        if(input.equals("L")){
            System.out.println("Look for place by index");
            String index = scanner.nextLine();
            if(Integer.parseInt(index) > placeName.size() -1 ) System.out.println("No item at "  + index  +" index");
            else System.out.println(placeName.get(Integer.parseInt(index)));
        }
        if(input.equals("Q")) break;
        }
    }
}

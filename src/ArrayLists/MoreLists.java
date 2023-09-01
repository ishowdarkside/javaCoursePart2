package ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        /*
        String[] items = {"apples","Bananas","Milk","Eggs"};

        List<String> list  = List.of(items);
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Yogurt");


        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles","mustard","Cheese")
        );
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);*//*
        ArrayList<String> groceryItems = new ArrayList<>(List.of("Milk","Bread","JAMAHA"));
        System.out.println(groceryItems.get(2));
        System.out.println(groceryItems.contains("JEBACINAAA"));
        groceryItems.add("Milk");
        groceryItems.removeAll(List.of("Milk"));
        System.out.println(groceryItems.indexOf("Milk"));
        groceryItems.retainAll(List.of("Bread"));
        System.out.println(groceryItems);
        groceryItems.clear();
        System.out.println(groceryItems.isEmpty());

        groceryItems.addAll(List.of("aaples","zilk","mustard"));
        System.out.println(groceryItems);
        groceryItems.sort(Comparator.naturalOrder());
        System.out.println(groceryItems);

        var groceryArray = groceryItems.toArray(new String[groceryItems.size()]);
 */

        ArrayList<String> myArrayList = new ArrayList<>(List.of("TI","SI","MOJA","JEDINA"));
        System.out.println(myArrayList);
        myArrayList.retainAll(List.of("MOJA"));
        System.out.println(myArrayList);

        String[] hennyArray = myArrayList.toArray(new String[myArrayList.size()]);
        System.out.println(hennyArray);

    }
}

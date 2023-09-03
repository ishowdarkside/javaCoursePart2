package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        /*
        //LinkedList<String> placesToVist = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);


        System.out.println(placesToVisit);
        removeElements(placesToVisit);


        //gettingElements(placesToVisit);

        printItinerary3(placesToVisit);
          */

        LinkedList<String> myList = new LinkedList<>();
        myList.addFirst("TEST1");
        myList.addLast("TEST2");
        myList.add("JEBO SAM TI MAJKU");
        testIterator(myList);
    }

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Darwin");
        list.addLast("Hobart");
        //queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        //stack methods
        list.push("Alice Springs");

    }

    private static void removeElements(LinkedList<String> list){
        list.remove(4);
        list.remove("Brisbane");

        String s1 = list.remove(); //removed first element
        System.out.println(s1 + " was removed");
        String s2 = list.removeFirst(); //removed first element;
        System.out.println(s2 + " was removed");
        String s3 = list.removeLast();
        System.out.println(s3 + " was removed");

        list.push("PRVI ITEM 1");
        list.push("PRVI ITEM 2");
        list.push("PRVI ITEM 3");
        System.out.println(list);
        String p4 = list.pop(); // removes first element
        System.out.println(p4 + "was removed");
    }


    private static void gettingElements(LinkedList<String> list){
        System.out.println("Reterieved element "+ list.get(4));
        System.out.println("FIRST ELEMENT " + list.getFirst());
        System.out.println("LAST ELEMENT " + list.getLast());
        System.out.println("DARWIN IS AT POSITION " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position:" + list.lastIndexOf("Melbourne"));
        // Queue retrieval method
        System.out.println("Element from element() = " + list.element());
        //Stack retreival
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekLast() = " + list.peekLast());

    }

    public static void printItinerary(LinkedList<String>  list){
        System.out.println("Trip starts at " + list.getFirst() );
        for(int i =1 ;i < list.size(); i++){
            System.out.println("--> FROM:" +  list.get(i-1) + " tot " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String>  list){
        System.out.println("Trip starts at " + list.getFirst() );
        String prevTown = list.getFirst();
        for(String town : list){
            System.out.println("--> FROM: " + prevTown + " to " + town);
            prevTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }


    public static void printItinerary3(LinkedList<String>  list){
        System.out.println("Trip starts at " + list.getFirst() );
        String prevTown = list.getFirst();
        ListIterator<String> iterator  = list.listIterator(1);
        while(iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> FROM: " + prevTown + " to " + town);

        }

        System.out.println("Trip ends at " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list){
        var iterator = list.listIterator();
        while(iterator.hasNext()){
            if(iterator.next().equals("TEST1")) iterator.add("JOJ TU JE TEST1");
        }

        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.next());
    }
}

package LinkedList;


import java.util.LinkedList;
import java.util.Scanner;

record Place(String name,int distance){

@Override
public String toString(){
    //Override toString methodu Recorda kako bi prikazao samo ime i distancu lokacije
    return  String.format("%s (%d)",name,distance);
}

}

public class Main2 {
    public static void main(String[] args) {
        //Initiate linkedlist
        LinkedList<Place> placesToVisit = new LinkedList<>();
        Place adelaide = new Place("Adelaide",1374);
        addPlace(placesToVisit,adelaide);
        addPlace(placesToVisit,new Place("adelaide",1374));
        addPlace(placesToVisit,new Place("Brisbane",917));
        addPlace(placesToVisit,new Place("Perth",3923));
        addPlace(placesToVisit,new Place("Alice Srpings",2771));
        addPlace(placesToVisit,new Place("Darwin",3972));
        addPlace(placesToVisit,new Place("Melbourne",877));
        placesToVisit.addFirst(new Place("Sydney",0));

        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while(!quitLoop) {
            if(!iterator.hasPrevious()) {
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }

            if(!iterator.hasNext()) {
                System.out.println("Final : " + placesToVisit.getLast());
                forward = false;
            }
         System.out.println("Enter Value: ");
         String menuItem = scanner.nextLine().toUpperCase().substring(0,1);
         switch(menuItem){
             case "F" -> {
                 if(!forward) { // Reversing direction
                     forward = true;
                     if(iterator.hasNext()) iterator.next(); // Adjust position forward
                 }
                 if(iterator.hasNext()) System.out.println(iterator.next());
             }
             case "B" -> {
                 if(forward){
                     forward = false;
                     if(iterator.hasPrevious()) iterator.previous();
                 }
                 if(iterator.hasPrevious()) System.out.println(iterator.previous());
             }
             case "M" -> printMenu();
             case "L" -> System.out.println(placesToVisit);
             default -> quitLoop = true;
         }
        }
    }

    //private funckija koja prima 2 argumenta, LinkedListu i place
    private static void addPlace(LinkedList<Place> list,Place place){
        //Ako lista sadrzi place uradi early return;
        if(list.contains(place)){
            System.out.println("Found duplicate: " + place);
            return;
        }

        //Za svaki item iz list provjeri da li je ime == Place-u koji pokusavamo da unesemo, ako jeste, uradi early return;
        for (Place p : list){
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found duplicate: " + place);
                return;
            }
        }

        //Initiate matchedIndex var koji pocinje od 0 (linkedlist 0 indexed logy). Za svaki place u ovoj listi provjeri da li je distance veca od tog current elementa
        //ako jeste, stavi ga na taj current index i povecavaj index kako loopas kroz listu..Na taj nacin, places ce biti ascending sortirani u zavisnosti od distance.
        int matchedIndex = 0;
        for(var listPlace : list){
            if(place.distance() < listPlace.distance()){
                list.add(matchedIndex,place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }

    private static void printMenu(){
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit""");
    }
}

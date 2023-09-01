package ArrayLists;

import java.util.ArrayList;

record GroceryItem(String name,String type,int count){

    public GroceryItem(String name){
        this(name,"DAIRY",1);
    }

    @Override
    public String toString(){
        return String.format("%d %s  in %s",count,name.toUpperCase(),type);
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<GroceryItem>  objectList= new ArrayList<>();
        objectList.add(new GroceryItem("Butter"));
        objectList.add(new GroceryItem("Milk"));
        objectList.add(new GroceryItem("Oranges","Produce",6));
        objectList.set(0,new GroceryItem("apples","PRODUCE",5));
        objectList.remove(1);
        System.out.println(objectList);


    }
}

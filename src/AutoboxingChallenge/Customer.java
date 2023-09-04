package AutoboxingChallenge;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;


    public Customer(String name){
        this.name = name;
        this.transactions = new ArrayList<>();
    }


    public void makeTransaction(double amount){
        this.transactions.add(amount);
    }
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}

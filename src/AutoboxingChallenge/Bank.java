package AutoboxingChallenge;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Customer> customers;


    public Bank(String name){
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer){
        if(this.getCustomer(customer.getName()) == null) this.customers.add(customer);
        else System.out.println("NEMOGUCE DODAT.USER VEC POSTOJI");
    }


    public static void makeTransaction(Customer customer,double amount){
        customer.makeTransaction(amount);


    }
    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    public Customer getCustomer(String name){
        for(Customer customer : this.customers){
        if(customer.getName().equalsIgnoreCase(name)) return customer;

        }
        return null;
   }
 public void printStatement(String customerName){

Customer customer = getCustomer(customerName);
if(customer == null) return;
System.out.println("-".repeat(30));
System.out.println("Customer name: " + customer.getName());
System.out.println("Transactions:");
for(double d : customer.getTransactions()) {
    System.out.printf("$%10.2f (%s) %n",d,d < 0 ? "debit" : "credit");
}
}
}

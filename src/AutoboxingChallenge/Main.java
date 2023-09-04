package AutoboxingChallenge;

public class Main {
    public static void main(String[] args) {
        Bank raiffeisenBank = new Bank("Raiffeisen");
        Customer ajdin = new Customer("Ajdin");
        raiffeisenBank.addCustomer(ajdin);

        raiffeisenBank.makeTransaction(ajdin,15);
        ajdin.makeTransaction(200);
        raiffeisenBank.printStatement("Ajdin");
        raiffeisenBank.printStatement("eigjegiea");

    }
}

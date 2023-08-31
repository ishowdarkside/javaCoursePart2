package VarArgs;

public class Main {
    public static void main(String... args) {
        System.out.println("HELLO WORLD AGAIN");
        String[] splitStrings = "Hello world again".split(" ");
        printText(splitStrings);
        System.out.println("_".repeat(20));
        printText("Hello","Worldic");
    }

    private static void printText(String... textList){
        for(String t : textList){
            System.out.println(t);
        }
        System.out.println(String.join("||",textList));
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        System.out.println("Enter first word: ");
        String text1 = io.nextLine();

        System.out.println("Enter second word: ");
        String text2 = io.nextLine();

        System.out.println("Enter search sentence: ");
        String textchain = io.nextLine();

        String check1 = (text1.substring(0,text1.length()));
        String check2 = (text2.substring(0,text2.length()));

        if(textchain.contains(check1) && textchain.contains(check2)){
            System.out.println("This sentence contains both words");
        }else{
            System.out.println("This sentence does not contains both words");
        }

    }
}
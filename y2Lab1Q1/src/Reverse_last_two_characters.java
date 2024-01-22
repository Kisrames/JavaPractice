
import java.util.Scanner;
public class Reverse_last_two_characters {

    public String text;
    public String last_digits;
    public static void main(String[] args) {

        Scanner io = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String text = io.nextLine();

        String last_digits = text.substring(text.length()-2,text.length());
        System.out.println(last_digits);

        System.out.println(text.substring(text.length()-1));
        System.out.println(text.substring(text.length()-2,text.length()-1));
        System.out.println(text.substring(0,text.length()-2));
        System.out.println(text.substring(0,text.length()-2) + text.substring(text.length()-1) + text.substring(text.length()-2,text.length()-1)) ;


//        String newtext = text.substring(0,text.length()-2) + last_digits.substring(0) + last_digits.substring(1);
    }

}
import java.util.Scanner;

public class First_and_last_are_same {
    public static void main(String[] args) {
        Scanner io =  new Scanner(System.in);
        System.out.println("Please enter a string: ");

        String text = io.nextLine();
        String last_two = text.substring(text.length()-2);

        if(text.substring(0,2).equals(last_two)){
            System.out.println("The first and last 2 letters are " + last_two);
        }
        else{
            System.out.println("The first and last 2 letters " + last_two + " are not the same");
        }
    }
}
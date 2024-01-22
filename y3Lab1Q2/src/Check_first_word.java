import java.util.Scanner;

public class Check_first_word {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        System.out.println("Enter search word: ");
        String text = io.nextLine();

        System.out.println("Enter test string: ");
        String test = io.nextLine();
        String word1 = text.substring(0,text.length());
        String word2 = test.substring(0,text.length());;

        System.out.println(word1);
        System.out.println(word2);


        if(word1.equals(word2)) {
            System.out.println(text + " is the first word");
        }
        else{
            System.out.println(text + " is not the first word");
            }
        }
    }

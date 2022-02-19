package w3;
import java.util.Scanner;

/**
 * The soalInputOutput program split the string into tokens
 * @author Annisa
 * @since 2022-02-20
 * @version 1.0
 */
public class soalInputOutput {
  /**
  *
  * @param args
  */
    public static void main(String[] args){
        String[] word;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Type A Sentence");
        String text = input.nextLine();
        
        word = text.split("[!?,._@' ]+");
        System.out.println(word.length);
        
        for(String wrd:word){
            System.out.println(wrd);
        }
        
    }
}

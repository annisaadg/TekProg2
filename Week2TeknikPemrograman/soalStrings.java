package soalStrings;
import java.io.*;
import java.util.Scanner;

/**
* <h1> Add two input strings! </h1>
* The soalStrings program determine The sum lengths of A and B,
* Determine if A is lexicographically larger than B or not,
* Capitalize the first letter in A and B and print them on a single line, 
* separated by a space.
* <p>
* <b>Note:</b> Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
*
* @author Annisa Dinda Gantini
* @version 1.0
* @since 2022-02-12
*/
public class soalStrings {

    /**
     * @param A This is the first paramter to addNum method
     * @param B This is the second paramter to addNum method
     * @return int This returns sum of lengthA and lengthB.
     */
    public static int Count(String A, String B) {
        int lengthA = A.length();
        int lengthB = B.length();
        return lengthA + lengthB;
    }
    
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input First String: ");
        String word1 = input.nextLine();
        System.out.print("Input Second String: ");
        String word2 = input.nextLine();
        
        int sum = Count(word1, word2);
        System.out.println(sum);
        
        int compare = word1.compareTo(word2);
        if(compare > 0) {
            System.out.println("Yes");
        }else if(compare < 0) {
            System.out.println("No");
        }else {
            System.out.println("Equal");
        }
        
        String concat = word1.substring(0,1).toUpperCase()+word1.substring(1) +" "+ word2.substring(0,1).toUpperCase()+word2.substring(1);
        System.out.println(concat);
    }
}

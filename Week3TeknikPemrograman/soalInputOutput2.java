package w3;
import java.util.Scanner;

/**
 * @author Annisa
 * @since 2022-02-20
 * @version 1.0
 */
public class soalInputOutput2 {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("================================");
            for(int index=0;index<3;index++)
            {
                String language=input.next();
                int num=input.nextInt();
                System.out.printf("%-15s%03d%n",language,num);
            }
            System.out.println("================================");

    }
}

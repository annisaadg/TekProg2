package w3;
import java.math.*;
import java.util.Scanner;

/**
 *
 * @author Annisa 
 * @since 2022-02-20
 * @version 1.0
 */
public class soalBigNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String a,b;
       a=input.nextLine();
       b=input.nextLine();
       input.close();
       System.out.println(new BigInteger(a).add(new BigInteger(b)));
       System.out.println(new BigInteger(a).multiply(new BigInteger(b)));
    }
    
}

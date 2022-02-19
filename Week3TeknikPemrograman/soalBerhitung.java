package w3;
import java.util.Scanner;

/**
 *
 * @author Annisa
 * @since 2022-02-20
 * @version 1.0
 */
public class soalBerhitung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2; // angka yang akan dioperasikan
        char operator; // operator 
        System.out.println("Give an operation: ");
        num1 = in.nextInt();
        operator = in.next().charAt(0); // input operator
        num2 = in.nextInt();
       
        System.out.println("Result: ");
        switch(operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }

    }
}

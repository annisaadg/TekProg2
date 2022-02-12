package soalDataType;
import java.util.Scanner;

/**
* <h1> Add an input integer! </h1>
* The soalDataType program determine which primitive data 
* types are capable of properly storing that input
* <p>
* <b>Note:</b> Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
*
* @author Annisa Dinda Gantini
* @version 1.0
* @since 2022-02-11
*/
public class soalDataType {

    /**
     * This method is used to determine data types.
     * @param banyak_input
     * @return 
     */
    public static int dataType(int banyak_input){
        int index;
        for(index=0; index<banyak_input; index++){
            Scanner input = new Scanner(System.in);
            int testCase = index+1;
            System.out.println("Test case-"+testCase+", Enter the input: ");
            try{
                long angka = input.nextLong();
                System.out.print(angka);
                System.out.println(" Can be fitted in: ");
                if(angka>=Byte.MIN_VALUE && angka<=Byte.MAX_VALUE){
                    System.out.println("* byte");
                }
                if(angka>=Short.MIN_VALUE && angka<=Short.MAX_VALUE){
                    System.out.println("* short");
                }
                if(angka>=Integer.MIN_VALUE && angka<=Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                if(angka>=Long.MIN_VALUE && angka<=Long.MAX_VALUE){
                    System.out.println("* long");
                }
            }
            catch(Throwable error){
                System.out.println("Can't be fitted anywehere");
                input.nextLine();
            }
        }
        return 0;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Case;
        
        System.out.println("Enter the number of test cases: ");
        Scanner input = new Scanner(System.in);
        Case = input.nextInt();
        dataType(Case);
    }
}

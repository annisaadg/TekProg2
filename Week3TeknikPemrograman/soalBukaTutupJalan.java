package w3;
import java.util.Scanner;

/**
 *
 * @author akira
 */
public class soalBukaTutupJalan {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args){
        String[] word;
        String gabung = "";
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan 4 Nomor Plat");
        String text = input.nextLine();
        
        word = text.split(" ");
        
        for(String wrd:word){
            gabung = gabung+wrd;
        }        
        double plat = Double.parseDouble(gabung);
        if(((plat-999999)%5)==0){
            System.out.println("berhenti");
        }else{
            System.out.println("jalan");
        }
        
    }
}

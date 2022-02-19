package w3;
import java.util.Scanner;

/**
 * @author Annisa
 * @since 2022-02-20
 * @version 1.0
 */
public class soalGajiAgent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gajiPokok = 500000;
        double hargaItem = 50000;
        double totalGaji,bonus,gajiItem,denda,itemDenda,potongan;
        
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan total penjualan item: ");
        int penjualan = input.nextInt();
        if(penjualan>80){
            bonus = (penjualan * hargaItem * 0.35);
            totalGaji = gajiPokok + bonus;
        }else if(penjualan>=40){
            bonus = (penjualan * hargaItem * 0.25);
            totalGaji = gajiPokok + bonus;
        }else if(penjualan<15){
            itemDenda = 15 - penjualan;
            denda = (itemDenda * hargaItem * 0.15);
            totalGaji = gajiPokok - denda;
        }else{
            bonus = (penjualan * hargaItem * 0.1);
            totalGaji = gajiPokok + bonus;
        }
        System.out.println("Gaji yang didapat: ");
        System.out.println(totalGaji);
    }
    
}

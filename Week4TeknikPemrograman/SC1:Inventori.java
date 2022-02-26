package SC1;

/**
 *
 * @author Annisa
 * @since 24/02/2022
 * @version 1.0
 */
public class Inventori {
    Barang[] barangs;
    /**
     * @param args the command line arguments
     */
    
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }
    
    void showBarang(){
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].stok + "}");
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].stok + ")");
    }
    
    void pengadaan() {
        initBarang();
        
        barangs[0].addstok(20);
        barangs[1].addstok(20);
        showBarang();
    }
    
    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
    
}

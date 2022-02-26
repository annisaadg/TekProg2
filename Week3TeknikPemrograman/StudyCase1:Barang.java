package SC1;

/**
 *
 * @author Annisa 
 * @since 24/02/2022
 * @version 1.0
 */
public class Barang {
    String kode_barang;
    String nama_barang;
    int stok;
    
        public Barang(String kode, String nama, int stk) {
            kode_barang = kode;
            nama_barang = nama;
            stok = stk;
        }
        
        public void addstok(int add){
           this.stok += add;
        }
        
        public int getstok(){
            return stok;
        }
}

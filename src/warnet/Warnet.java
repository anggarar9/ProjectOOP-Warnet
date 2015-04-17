/*
diasumsikan program ini untuk warnet yang memakai sistem 
bayar diawal, lalu diberi username untuk login kedalam komputernya
 */

package warnet;

/**
 *
 * @author Rifqi
 */
public class Warnet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Petugas petugas1 = new Petugas();
        try{
            petugas1.setNoPetugas("123");
        }catch (Exception ey){
            System.out.println(ey.getMessage());
        }
        //untuk membuat supaya nomor petugas hanya angka saja
        try {
            petugas1.setNama("Rifqi");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        //untuk membuat supaya nomor petugas hanya huruf saja
        
        
        Pelanggan username1 = new Pelanggan();
        username1.setUsername(Integer.toString(Pelanggan.randInt()));
        //karena hasil dari method randInt integer, perlu diubah ke string
        
        
        Komputer noKomputer = new Komputer();
        try{
            noKomputer.setNoKomputer("122");
        }catch(Exception ez){
            System.out.println(ez.getMessage());
        }
        cetakKupon(kupon);
        
        
        
    }
    
    public static void cetakKupon(KuponLogin kupon){
        System.out.println("=======================");
        System.out.println(kupon.getPetugas());
        System.out.println("=======================");
        System.out.println(kupon.getNoKomputer());
        System.out.println(kupon.getUsername());
        System.out.println("=======================");
        System.out.println(kupon.getWaktuMulai());
    }
    
}

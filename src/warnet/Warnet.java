/*
diasumsikan program ini untuk warnet yang memakai sistem 
bayar diawal, lalu diberi username untuk login kedalam komputernya
 */

package warnet;

import java.util.Date;

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
        
        
        
        
        Biaya biaya1 = new Biaya();
        try{
            biaya1.setHarga("2500");//
        }catch(Exception ea){
            System.out.println(ea.getMessage());
        }
        try{
            biaya1.setTotalWaktu("3");
        }catch(Exception eb){
            System.out.println(eb.getMessage());
        }
        try{
            biaya1.TotalBayar(biaya1.getTotalWaktu());
        }catch(Exception ec){
            System.out.println(ec.getMessage());
        }
        
        
        KuponLogin kupon1 = new KuponLogin();
        kupon1.setPetugas(petugas1);
        kupon1.setNoKomputer(noKomputer);
        kupon1.setUsername(username1);
        kupon1.setWaktuMulai(new Date());
        kupon1.setWaktuSelesai(Integer.parseInt(biaya1.getTotalWaktu()));
        kupon1.setHarga(biaya1);
        kupon1.setTotalBayar(biaya1.TotalBayar(biaya1.getTotalWaktu()));
        
                
        
        cetakKupon(kupon1);
    }
    
    public static void cetakKupon(KuponLogin kupon){
        System.out.println("=======================");
        System.out.println("Nama Operator: "+kupon.getPetugas().getNama());
        System.out.println("No Operator: "+kupon.getPetugas().getNoPetugas());
        System.out.println("=======================");
        System.out.println("No Komputer: "+kupon.getNoKomputer().getNoKomputer());
        System.out.println("Username untuk Login: "+kupon.getUsername().getUsername());
        System.out.println("=======================");
        System.out.println("waktu mulai: "+kupon.getWaktuMulai());
        System.out.println("waktu selesai: "+kupon.getWaktuSelesai());
        System.out.println("=======================");
        System.out.println("Harga Per-Jam: "+kupon.getHarga().getHarga());
        System.out.println("Harga yang harus dibayarkan: "+kupon.getTotalBayar());
        
    }
    
}

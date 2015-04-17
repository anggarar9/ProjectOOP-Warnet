/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package warnet;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author Rifqi
 */
public class Biaya {
    
    private String harga ;
    private String totalWaktu;
    
    
    
    
    public String TotalBayar(String total ){
        int harga1 = Integer.parseInt(getHarga());
        int waktu = Integer.parseInt(total);
        int bayar = harga1 * waktu;      
        String bayar1= Integer.toString(bayar);
        
        return bayar1;
    }

    /**
     * @return the harga
     */
    public String getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(String harga) throws Exception{
        for(char c : harga.toCharArray()){
            if(Character.isLetter(c)){
                throw new Exception("harga perjam harus berisi angka semua");
            } 
        }this.harga = harga;
    }

    /**
     * @return the totalWaktu
     */
    public String getTotalWaktu() {
        return totalWaktu;
    }

    /**
     * @param totalWaktu the totalWaktu to set
     */
    public void setTotalWaktu(String totalWaktu)throws Exception {
        for(char c : totalWaktu.toCharArray()){
            if(Character.isLetter(c)){
                throw new Exception("total waktu harus berisi angka(dalam jam)");
            } 
        }this.totalWaktu = totalWaktu;
    }

    
}

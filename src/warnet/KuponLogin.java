/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package warnet;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Rifqi
 */
public class KuponLogin {
    private Petugas petugas;
    private Pelanggan Username;
    private Komputer noKomputer;
    private Date waktuMulai;
    private String waktuSelesai;
    private Biaya harga;
    private Biaya totalWaktu;
    private String totalBayar;
    
    
    
    public void setWaktuSelesai(int total){
        SimpleDateFormat df = new SimpleDateFormat("HH:mm");
        Date d = new Date(); 
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR, total);
        String newTime = df.format(cal.getTime());
        waktuSelesai = newTime;
        this.waktuSelesai = waktuSelesai;
    }
    public String getWaktuSelesai(){
        return waktuSelesai;
    }
        

    /**
     * @return the petugas
     */
    public Petugas getPetugas() {
        return petugas;
    }

    /**
     * @param petugas the petugas to set
     */
    public void setPetugas(Petugas petugas) {
        this.petugas = petugas;
    }

    /**
     * @return the Username
     */
    public Pelanggan getUsername() {
        return Username;
    }

    /**
     * @param Username the Username to set
     */
    public void setUsername(Pelanggan Username) {
        this.Username = Username;
    }

    /**
     * @return the noKomputer
     */
    public Komputer getNoKomputer() {
        return noKomputer;
    }

    /**
     * @param noKomputer the noKomputer to set
     */
    public void setNoKomputer(Komputer noKomputer) {
        this.noKomputer = noKomputer;
    }

    /**
     * @return the waktuMulai
     */
    public Date getWaktuMulai() {
        return waktuMulai;
    }

    /**
     * @param waktuMulai the waktuMulai to set
     */
    public void setWaktuMulai(Date waktuMulai) {
        this.waktuMulai = waktuMulai;
    }

    /**
     * @return the harga
     */
    public Biaya getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(Biaya harga) {
        this.harga = harga;
    }

    /**
     * @return the totalWaktu
     */
    public Biaya getTotalWaktu() {
        return totalWaktu;
    }

    /**
     * @param totalWaktu the totalWaktu to set
     */
    public void setTotalWaktu(Biaya totalWaktu) {
        this.totalWaktu = totalWaktu;
    }

    /**
     * @return the totalBayar
     */
    public String getTotalBayar() {
        return totalBayar;
    }

    /**
     * @param totalBayar the totalBayar to set
     */
    public void setTotalBayar(String totalBayar) {
        this.totalBayar = totalBayar;
    }
}

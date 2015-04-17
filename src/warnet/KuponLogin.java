/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package warnet;

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
}

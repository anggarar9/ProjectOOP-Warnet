/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package warnet;

/**
 *
 * @author Rifqi
 */
public class Petugas {
    private String nama;
    private String noPetugas;

    /**
     * @return the namaPetugas
     */
    
    public Petugas(){
    }
    
    public Petugas(String noPetugas, String nama ) throws Exception{
        try{
            this.setNoPetugas(noPetugas);
        }catch(Exception e){
            throw e;
        }
        try {
            this.setNama(nama);
        } catch (Exception e) {
            throw e;
        }
    }
            
            
            
    public String getNama() {
        return nama;
    }

    /**
     * @param nama
     * @param namaPetugas the namaPetugas to set
     */
    public void setNama(String nama) throws Exception {
        
        for (char c : nama.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new Exception("Nama tidak boleh "
                        + "mengandung angka");
            }
        }
        this.nama = nama;
    }//untuk membuat supaya nomor petugas hanya huruf saja

    /**
     * @return the noPetugas
     */
    public String getNoPetugas() {
        return noPetugas;
    }

    /**
     * @param noPetugas the noPetugas to set
     */
    public void setNoPetugas(String noPetugas)throws Exception {
        for(char c : noPetugas.toCharArray()){
            if(Character.isLetter(c)){
                throw new Exception("no petugas harus angka");
            } 
        }this.noPetugas = noPetugas;
    }//untuk membuat supaya nomor petugas hanya angka saja
}

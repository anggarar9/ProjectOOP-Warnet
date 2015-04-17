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
public class Komputer {
    private String noKomputer;

    /**
     * @return the noKomputer
     */
    public String getNoKomputer() {
        return noKomputer;
    }

    /**
     * @param noKomputer the noKomputer to set
     */
    public void setNoKomputer(String noKomputer)throws Exception {
            for(char c : noKomputer.toCharArray()){
            if(Character.isLetter(c)){
                throw new Exception("no petugas harus angka");
            } 
        }this.noKomputer = noKomputer;
    }//untuk membuat supaya nomor komputer hanya angka saja
    
    
}

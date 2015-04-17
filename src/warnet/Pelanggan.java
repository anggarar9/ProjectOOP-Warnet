/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package warnet;

import java.util.Random;

/**
 *
 * @author Rifqi
 */
public class Pelanggan {
    private String Username;

    /**
     * @return the Username
     */
    
    public String getUsername() {
        return Username;
    }

    /**
     * @param Username the Username to set
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }
    
    public static int randInt(){
        Random rand = new Random();
        
        int randomNum = rand.nextInt(((5000-1000)+1)+1000);
        //username yg digunakan di random antara angka 1000 sampai 5000
        
        return randomNum;
        //method ini digunakan untuk membuat angka random bagi Username
    }
}

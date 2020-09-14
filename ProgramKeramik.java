/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programkeramik;

/**
 *
 * @author LENOVO
 */
public class ProgramKeramik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Dalam kasus ini saya langsung bulatkan untuk ukuran keramik dan luasnya, yang tadinya luasnya 100m kuadrat menjadi 1000000
        
        HitungBiaya keramikA = new HitungBiaya ();
        keramikA.ukuran = 900;  // 900 didapatkan dari ukuran 30 x 30
        keramikA.luas = 1000000; // 1000000 didapatkan dari konversi luas 100m kuadrat menjadi cm 
        keramikA.keramikA();
        
        
        HitungBiaya keramikB = new HitungBiaya ();
        keramikB.ukuran = 1600; // 1600 didapatkan dari ukuran 40 x 40
        keramikB.luas = 1000000; // 1000000 didapatkan dari konversi luas 100m kuadrat menjadi cm
        keramikB.keramikB();
        
        HitungBiaya keramikC = new HitungBiaya ();
        keramikC.ukuran = 1200;  // 1200 didapatkan dari ukuran 30 x 40
        keramikC.luas = 1000000; // 1000000 didapatkan dari konversi luas 100m kuadrat menjadi cm
        keramikC.keramikC();
        
        HitungBiaya hasil = new HitungBiaya();
        hasil.hasil();
    }
       
}

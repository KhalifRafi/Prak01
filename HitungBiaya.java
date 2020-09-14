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
public class HitungBiaya {
    
    // ATRIBUT
    int ukuran;
    int luas;
    
    // METHODS
    void keramikA () {
        // Ini Banyak Keramik Dalam Satuan Biji, Belum Dalam Bentuk Per Box
        int total;
        total = this.luas / ukuran;
        System.out.println("----- KERAMIK A -----");
        System.out.println("Banyak keramik yang dibutuhkan adalah :" + total +" biji");
        
        // Fungsi dibagi 10 adalah agar menjadikan yang tadinya masih dalam satuan biji menjadi dalam satuan box
        int biaya;
        biaya = total / 10 * 54000;
        System.out.println("Jadi biaya yang harus dikeluarkan adalah :" + biaya + "\n");
        
    }
    void keramikB () {
        // Ini Banyak Keramik Dalam Satuan Biji, Belum Dalam Bentuk Per Box
        int total;
        total = this.luas / ukuran;
        System.out.println("----- KERAMIK B -----");
        System.out.println("Banyak keramik yang dibutuhkan adalah :" + total +" biji");
        
        // Fungsi dibagi 5 adalah agar menjadikan yang tadinya masih dalam satuan biji menjadi dalam satuan box
        int biaya;
        biaya = total / 5 * 65000;
        System.out.println("Jadi biaya yang harus dikeluarkan adalah :" + biaya +"\n");
    }
    void keramikC () {
        // Ini Banyak Keramik Dalam Satuan Biji, Belum Dalam Bentuk Per Box
        int total;
        total = this.luas / ukuran;
        System.out.println("----- KERAMIK C -----");
        System.out.println("Banyak keramik yang dibutuhkan adalah :" + total +" biji");
        
        // Fungsi dibagi 8 adalah agar menjadikan yang tadinya masih dalam satuan biji menjadi dalam satuan box
        int biaya;
        biaya = total / 8 * 60000;
        System.out.println("Jadi biaya yang harus dikeluarkan adalah :" + biaya +"\n");
    }
    void hasil() {
        System.out.println("SEHINGGA KERAMIK YANG TOTAL HARGA BELINYA PALING MURAH DAN SESUAI KEBUTUHAN ADALAH KERAMIK A");
    }
}

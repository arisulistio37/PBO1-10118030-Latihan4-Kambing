/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118030.latihan4.kambing;

/**
 *
 * @author 
 * NAMA     : Ari Sulistio
 * KELAS    : IF-1
 * NIM      : 10118030
 */
public class PBO110118030Latihan4Kambing {

    public void tambahKambing(){
       // Deklarasi variabel lokal
       int jumlahKambing = 1;
       
       jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: "+jumlahKambing);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PBO110118030Latihan4Kambing kambingJantan = new PBO110118030Latihan4Kambing();
        kambingJantan.tambahKambing();
    }
    
}

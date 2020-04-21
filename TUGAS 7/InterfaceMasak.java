/*
	Nama	: Paramadina Mulya Majid
	Stambuk	: 13020180006
	Kelas	: B1
	Hari/Tanggal : Minggu, 20 April 2020
	Waktu	: 12.42 WITA
*/
package Tugas7;

public class InterfaceMasak implements Interface{

    @Override
    public void bahan(){
        String bahan1 = "Tepung Terigu";
        String bahan2 = "Mentega";
        String bahan3 = "Gula";
        String bahan4 = "Telur";
        
        System.out.println("BAHAN-BAHAN : ");
        System.out.println("1. "+bahan1);
        System.out.println("2. "+bahan2);
        System.out.println("3. "+bahan3);
        System.out.println("4. "+bahan4);
        
    }

    @Override
    public void prosesPembuatan(){
        System.out.println("PROSES PEMBUATAN : ");
        System.out.println("1. Aduk dan Campurkan Semua Bahan");
        System.out.println("2. Masukkan kedalam Loyang");
        System.out.println("3. Oven Sampai Matang");
        System.out.println("4. Selesai");
    }
    
}

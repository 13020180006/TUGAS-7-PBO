/*
	Nama	: Paramadina Mulya Majid
	Stambuk	: 13020180006
	Kelas	: B1
	Hari/Tanggal : Minggu, 20 April 2020
	Waktu	: 13.10 WITA
*/
package Tugas7;

public abstract class AbstractClassdanInterface {
    String nama;
    int jumlahKaki;
    
    public void binatang(String nama, int jumlahKaki){
        this.nama=nama;
        this.jumlahKaki=jumlahKaki;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setKaki(int jumlahKaki){
        this.jumlahKaki = jumlahKaki;
    }
    public int getKaki(){
        return jumlahKaki;
    }
    public void tampilBinatang(){
        System.out.println("Nama Binatang : "+getNama());
        System.out.println("Jumlah Kaki   : "+getKaki());
    }
}

/*
	Nama	: Paramadina Mulya Majid
	Stambuk	: 13020180006
	Kelas	: B1
	Hari/Tanggal : Minggu, 20 April 2020
	Waktu	: 13.34 WITA
*/
package Tugas7;

public class Ayam extends AbstractClassdanInterface implements Karnivora{

    public Ayam(String nama, int jumlahKaki) {
        this.nama = nama;
        this.jumlahKaki = jumlahKaki;
    }
    @Override
    public void tampil() {
        System.out.println("Jenis "+jenis);
        System.out.println("Lahir : "+lahir);
    }
    @Override
    public void tampilBinatang(){
        System.out.println("Nama Hewan  : "+getNama());
        System.out.println("Jumlah Kaki : "+getKaki());  
    }
    public void tampilOutput(){
        tampil();
        tampilBinatang();
    }
}

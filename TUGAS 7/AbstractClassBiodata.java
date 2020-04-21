/*
	Nama	: Paramadina Mulya Majid
	Stambuk	: 13020180006
	Kelas	: B1
	Hari/Tanggal : Minggu, 20 April 2020
	Waktu	: 12.29 WITA
*/
package Tugas7;

public class AbstractClassBiodata {
    public static void main(String[] args){
        AbstractClass abs = new AbstractClass() {};
        String nama = "Paramadina Mulya Majid";
        String stb = "13020180006";
        
        abs.biodata();
        abs.inputData(nama, stb);
    }
}

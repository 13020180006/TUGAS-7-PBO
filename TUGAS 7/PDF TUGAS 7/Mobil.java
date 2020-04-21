/*
	Nama	: Paramadina Mulya Majid
	Stambuk	: 13020180006
	Kelas	: B1
	Hari/Tanggal : Minggu, 20 April 2020
	Waktu	: 14.13 WITA
*/
package Tugas7;

abstract public class Mobil implements PropertiInM{ 
    abstract public void injakPedalGas(); 
    public void injakRem(){  
        System.out.println("Mobil berhenti!");
    }  
} 

class Kijang extends Mobil{ 
    @Override
    public void injakPedalGas(){ 
        System.out.println("Mobil Melaju dengan kecepatan 100 Km/jam...");
    }
    
    public int berukuran(int ukuran) { 
        return ukuran;
    }  
    public int berkekuatan(int kekuatan) { 
        return kekuatan;  
    } 
} 
class BMW extends Mobil {
    @Override
    public void injakPedalGas(){ 
        System.out.println("Mobil Melaju dengan kecepatan 100 Km/jam...");
    }
    public int berukuran(int ukuran) {  
        return ukuran;  
    } 
    public int berkekuatan(int kekuatan) {  
        return kekuatan;  
    } 
}

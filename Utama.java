package com.company;

public class Utama extends Character {
    public Utama(String nama, String asal, String pekerjaan) {
        super(nama, asal, pekerjaan);
    }
    public void displayCharacter(){
        System.out.println("- Nama " +nama+ " tinggal di " +asal+ " pekerjaan " +pekerjaan);
    }
}

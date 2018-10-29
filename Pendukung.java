package com.company;

public class Pendukung extends Character{
    private String relate;

    public Pendukung(String nama, String asal, String pekerjaan, String relate) {
        super(nama, asal, pekerjaan);
        this.relate = relate;
    }

    public String getRelate() {
        return relate;
    }

    public void displayCharacter(){
        System.out.println("- Nama " +nama+ " tinggal di " +asal+ " pekerjaan " +pekerjaan+ " berelasi dengan " +relate );
    }
}

package com.company;

public class Character {
    protected String nama;
    protected String asal;
    protected String pekerjaan;

    public Character(String nama, String asal, String pekerjaan) {
        this.nama = nama;
        this.asal = asal;
        this.pekerjaan = pekerjaan;
    }

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }
}

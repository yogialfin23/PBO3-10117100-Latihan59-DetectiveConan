package com.company;

/**
 * Yogie Alfin Salim
 * 10117100
 * IF-3
 */
public class Main {

    public static void main(String[] args) {
	Character c = new Character("", "", "");
        System.out.println("=====Character Detective Conan=====");
	Utama conan = new Utama ("Shinici Kudo/Conan Edogawa", "Tokyo", "Detective dan Pelajar");
	Utama kogoro = new Utama("Kogoro Mouri", "Tokyo", "Detective");
	Utama heiji = new Utama ("Heiji Hattori", "Osaka", "Detective dan Pelajar");
	Utama ran = new Utama ("Ran Mouri", "Tokyo", "Pelajar");
	Pendukung ai = new Pendukung("Shiho Miyano/Ai Haibara", "Tokyo", "Ilmuwan Pencipta APTX-4869 dan Pelajar", "Conan");
	Pendukung eri = new Pendukung("Eri Kisaki", "Tokyo", "Pengacara", "Ran dan Kogoro");
	Pendukung genta = new Pendukung("Genta Kojima", "Tokyo", "Pelajar", "Conan");
	Pendukung mitsuhiko = new Pendukung("Mitsuhiko Tsuburaya", "Tokyo", "Pelajar", "Conan");
	Pendukung ayumi = new Pendukung("Ayumi Yoshida", "Tokyo", "Pelajar", "Conan");

		System.out.println("Detective");
		conan.displayCharacter();
		kogoro.displayCharacter();
		heiji.displayCharacter();
		System.out.println("\nDetective Cilik");
		conan.displayCharacter();
		genta.displayCharacter();
		ayumi.displayCharacter();
		mitsuhiko.displayCharacter();
		ai.displayCharacter();
		System.out.println("\nKeluarga");
		kogoro.displayCharacter();
		ran.displayCharacter();
		eri.displayCharacter();
		System.out.println("\nKorban APTX-4869");
		conan.displayCharacter();
		ai.displayCharacter();
    }
}

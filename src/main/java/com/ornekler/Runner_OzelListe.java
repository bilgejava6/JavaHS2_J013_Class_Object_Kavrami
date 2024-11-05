package com.ornekler;

public class Runner_OzelListe {
    public static void main(String[] args) {
        OzelListe ozelListe = new OzelListe();
        ozelListe.add("Muhammet HOCA");
        ozelListe.add("Demet");
        ozelListe.add("Ahmet");
        ozelListe.add("Hakan");
        ozelListe.add("Tekin");
        ozelListe.add("Emine");
        ozelListe.add("Aylin");
        ozelListe.add("Bahar");

        ozelListe.list();

        ozelListe.update(4, "TEKKIN TAŞ");

        ozelListe.list();
    }
}

package com.ornekler;

public class Runner_OzelListe {
    public static void main(String[] args) {
        OzelListe ozelListe = new OzelListe();
        System.out.println("""
                *** Mevcut Liste
                """);
        ozelListe.add("Muhammet HOCA");
        ozelListe.add("Demet");
        ozelListe.add("Ahmet");
        ozelListe.add("Hakan");
        ozelListe.add("Tekin");


        ozelListe.list();

        System.out.println("""
                *** Silindikten sonra listei
                """);
       ozelListe.remove("Hakan");

        ozelListe.list();
    }
}

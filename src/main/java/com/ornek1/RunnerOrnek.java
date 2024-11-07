package com.ornek1;

import java.util.Scanner;

public class RunnerOrnek {
    public static void main(String[] args) {
        OzelListe liste = new OzelListe();
        boolean cikalimMi = false; // hayır
        do{
            System.out.println("""
                    **** Öğrenci Ekleme ****
                    """);
            System.out.print("Öğrencinin adı........: ");
            String ad = new Scanner(System.in).nextLine();
            System.out.print("Öğrencinin okul no....: ");
            String okulNo = new Scanner(System.in).nextLine();
            System.out.print("Öğrencinin adresi.....: ");
            String adres = new Scanner(System.in).nextLine();
            System.out.print("Öğrencinin veli.......: ");
            String veli = new Scanner(System.in).nextLine();
            System.out.print("Öğrencinin sınıfı.....: ");
            String sinif = new Scanner(System.in).nextLine();
            Ogrenci ogrenci = new Ogrenci();
            ogrenci.sinif = sinif;
            ogrenci.veli = veli;
            ogrenci.adres = adres;
            ogrenci.ad = ad;
            ogrenci.okulNo = okulNo;
            liste.add(ogrenci);
            System.out.print("Çıkmak istiyor musunuz? [E/H]");
            String secim = new Scanner(System.in).nextLine();
            if (secim.equalsIgnoreCase("E"))
                cikalimMi = true;
        }while (!cikalimMi);

        liste.list(); // öğrencileri listele
    }
}

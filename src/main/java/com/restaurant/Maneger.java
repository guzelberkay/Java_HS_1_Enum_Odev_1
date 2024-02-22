package com.restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Maneger {
    private List<Menu.MenuYemek> haftalikMenu;
    private Random rastgele;
    private List<Menu.Icecekler> icecekler;
    private Menu.Gunler[] gunlerArray = Menu.Gunler.values();

    public Maneger() {
        haftalikMenu = new ArrayList<>();
        rastgele = new Random();
        icecekler = new ArrayList<>(List.of(Menu.Icecekler.values()));
    }

    public void HaftalikMenuOlustur() {
        List<Menu.Corbalar> corbalar = new ArrayList<>(List.of(Menu.Corbalar.values()));
        List<Menu.Yemekler> yemekler = new ArrayList<>(List.of(Menu.Yemekler.values()));
        List<Menu.Tatlilar> tatlilar = new ArrayList<>(List.of(Menu.Tatlilar.values()));

        List<Menu.Icecekler> gunlukIcecekler = new ArrayList<>(icecekler);

        for (Menu.Gunler gun : gunlerArray) {
            Menu.Corbalar corba = corbalar.get(rastgele.nextInt(corbalar.size()));
            Menu.Yemekler yemek = yemekler.get(rastgele.nextInt(yemekler.size()));
            Menu.Tatlilar tatli = tatlilar.get(rastgele.nextInt(corbalar.size()));

            Menu.Icecekler icecek = gunlukIcecekler.get(rastgele.nextInt(gunlukIcecekler.size()));

            Menu.MenuYemek menuYemek = new Menu.MenuYemek(gun, corba, icecek, yemek, tatli);

            System.out.println("Gun: " + (gun));
            System.out.println("Corba: " + menuYemek.corba);
            System.out.println("Icecek: " + menuYemek.icecek);
            System.out.println("Yemek: " + menuYemek.yemek);
            System.out.println("Tatli: " + menuYemek.tatli);
            System.out.println();

            haftalikMenu.add(menuYemek);

            gunlukIcecekler.remove(icecek);
        }
        System.out.println("Haftalik Menu: " + haftalikMenu);
    }
}
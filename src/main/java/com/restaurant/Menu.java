package com.restaurant;

public class Menu {
    public enum Gunler{
        PAZARTESI, SALI, CARSAMBA, PERSEMBE, CUMA, CUMARTESI, PAZAR
    }
    public enum Corbalar{
        MERCIMEK_CORBASI, DOMATES_CORBASI, EZOGELIN_CORBASI, TARHANA_CORBASI, KREMALI_TAVUK_CORBASI, DUGUN_CORBASI, YAYLA_CORBASI
    }
    public enum Tatlilar{
        SUTLAC, WAFFLE, KAZANDIBI, BAKLAVA, PASTA, PROFITEROL,SUPANGLE
    }
    public enum Icecekler{
        KOLA, MEYVE_SUYU, LIMONATA, SU, CAY, AYRAN, GAZOZ
    }
    public enum Yemekler{
        MAKARNA, IZGARA_TAVUK, PIZZA, HAMBURGER, KEBAP, ET_DONER, LAHMACUN
    }
    public static class MenuYemek{
        private Menu.Gunler gun;
        Menu.Corbalar corba;
        Menu.Icecekler icecek;
        Menu.Yemekler yemek;
        Menu.Tatlilar tatli;

        public MenuYemek(Menu.Gunler gun, Menu.Corbalar corba, Menu.Icecekler icecek, Menu.Yemekler yemek, Menu.Tatlilar tatli) {
            this.gun = gun;
            this.corba = corba;
            this.icecek = icecek;
            this.yemek = yemek;
            this.tatli = tatli;
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("MenuYemek{");
            sb.append("gun=").append(gun);
            sb.append(", corba=").append(corba);
            sb.append(", icecek=").append(icecek);
            sb.append(", yemek=").append(yemek);
            sb.append(", tatli=").append(tatli);
            sb.append('}');
            return sb.toString();
        }
}}

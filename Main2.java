package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author HERLEY
 */
public class Main2 {
    public static void main(String[] args) {
        
        OperasiBilanganBulat penjumlahan = (a, b) -> a+b;
        
        OperasiBilanganBulat perkalian = (a,b) -> a*b;
        
        System.out.println(penjumlahan.operasiDuaBilangan(7, 10));
        System.out.println(perkalian.operasiDuaBilangan(7, 10));
        
        PengolahKata hurufKecil = pesan -> pesan.toLowerCase();
        PengolahKata hurufBesar = pesan -> pesan.toUpperCase();
        
        System.out.println(hurufKecil.representasiCase("SeMBarang RePreSentasi"));
        System.out.println(hurufBesar.representasiCase("SeMBarang RePreSentasi"));
    }   
}

interface PengolahKata{
    
    /**
     * Melakukan Representasi pada pesan. 
     * @param pesan
     * @return 
     */
    String representasiCase(String pesan);
}

interface OperasiBilanganBulat{
    /**
     * Melakukan operasi dua bilangan bulat.
     * @param bilanganPertama
     * @param bilanganKedua
     * @return 
     */
    double operasiDuaBilangan(int bilanganPertama, double bilanganKedua);
}



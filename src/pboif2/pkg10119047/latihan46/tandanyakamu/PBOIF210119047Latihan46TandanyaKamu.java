/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan46.tandanyakamu;

import java.util.Calendar;
import data.Age;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENAMPLKAN UMUR DAN KETERANGANNYA
 */

public class PBOIF210119047Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                //inisialisasi objek scanner
        Scanner input = new Scanner(System.in);
        
        //inisialisasi objek Age
        Age age = new Age(Calendar.getInstance().get(Calendar.YEAR));
        
        //input
        System.out.print("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(input.nextInt());
        
        //output
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : " + age.getYearBirth());
        System.out.println("Hari ini tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + age.hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu " + age.tandanyaKamu(age.hitungUmur()));
    }
    
}

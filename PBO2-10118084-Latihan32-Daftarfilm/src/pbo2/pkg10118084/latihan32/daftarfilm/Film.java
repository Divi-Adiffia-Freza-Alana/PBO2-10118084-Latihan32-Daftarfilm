/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan32.daftarfilm;

/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menampilkan daftar film

 */
public class Film {
    
    public String filmName,filmGenre;
    public double filmRating;
    public int filmDuration;
    
    public void nowPlaying(String filmName,String filmGenre,double filmRating,int filmDuration) {
        System.out.println("===Daftar film Sedang Tayang===");
        System.out.println("");
        System.out.println("");
        System.out.println("Judul Film :" +filmName);
        System.out.println("Genre Film :" +filmGenre);
        System.out.println("RatingFilm :" +filmRating);
        System.out.println("Duration Film :"+filmDuration+ "Menit");
        
}
}

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
*Deskripsi Program : Program ini berisi program untuk menampilkan Daftarfilm

 */
public class PBO210118084Latihan32Daftarfilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Film Film1 = new Film();
        Film1.filmName ="Vaenom";
        Film1.filmGenre ="Action,Horror,Scifi";
        Film1.filmRating = 8.5;
        Film1.filmDuration = 120;
        Film1.nowPlaying(Film1.filmName,Film1.filmGenre,Film1.filmRating,Film1.filmDuration);
        
        Film Film2 = new Film();
        Film2.filmName ="Small Foot";
        Film2.filmGenre ="Animation";
        Film2.filmRating = 9.0;
        Film2.filmDuration = 96;
        Film2.nowPlaying(Film2.filmName,Film2.filmGenre,Film2.filmRating,Film2.filmDuration);
        
        Film Film3 = new Film();
        Film3.filmName ="Crazy Rich Asian";
        Film3.filmGenre ="Comedy";
        Film3.filmRating = 7.8;
        Film3.filmDuration = 119;
        Film3.nowPlaying(Film3.filmName,Film3.filmGenre,Film3.filmRating,Film3.filmDuration);
        
        Film Film4 = new Film();
        Film4.filmName ="Asih";
        Film4.filmGenre ="Horror";
        Film4.filmRating = 6.0;
        Film4.filmDuration = 100;
        Film4.nowPlaying(Film4.filmName,Film4.filmGenre,Film4.filmRating,Film4.filmDuration);
    }
    
}

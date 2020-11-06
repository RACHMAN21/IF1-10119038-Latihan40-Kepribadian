/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.latihan40.kepribadian;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : program ini berisi class warna
 * 
 */

import java.util.Scanner;

public class Warna {
    public final String foreground = "\033[38;2;";
    public final String background = "\033[48;2;";
    public final String netral = "\033[0m";
    public final String merah = "255;0;0m";
    public final String hijau = "0;255;0m";
    public final String biru = "0;0;255m";
    public final String kuning = "255;255;0m";
    public final String ungu = "255;0;255m";
    public final String cyan = "0;255;255m";
    public final String putih = "255;255;255m";
}
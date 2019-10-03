/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luasbalok;

/**
 *
 * @author ica
 */
public class LuasBalok {
    public static void main(String[] args) {
        int p = 10;
        int l = 25;
        int t = 40;
        System.out.println("Nilai Panjang Balok: " + p);
        System.out.println("Nilai Lebar Balok: " + l);
        System.out.println("Nilai Tinggi Balok: " + t);
        System.out.println();
        System.out.println("===============================");
        System.out.println("Menghitung Luas Permukaan Balok");
        System.out.println("===============================");
        System.out.println("Luas Permukaan Balok= " +((2*p*l)+ (2*p*t)+(2*l*t)));
        
    }
    
}

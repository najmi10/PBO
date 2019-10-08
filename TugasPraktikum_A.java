/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum_a;

/**
 *
 * @author ica
 */
public class TugasPraktikum_A {
    public static void main(String[] args) {
        System.out.println("Luas Permukaan Bola: " + bola());
        System.out.println("Luas Permukaan Lingkaran: " + lingkaran());
        
    }
    public static double bola(){
        int r = 10;
        double phi = 3.14;
        double hasil = 4*phi*r*r;
        return hasil;
    }
    public static double lingkaran(){
        int r = 42;
        double phi = 3.14;
        double hasil = phi*r*r;
        return hasil;
        
    }
    
}

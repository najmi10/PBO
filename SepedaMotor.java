/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedamotor;

/**
 *
 * @author ica
 */
public class SepedaMotor {
    public static void main(String[] args) {
        SepedaMotor motor = new SepedaMotor();
        motor.setMerk("");
        motor.setNama("");
    }
    private void setMerk(String merk){
        merk = "Honda";
        System.out.println("Merk motor adalah: " + merk);
        
    }
    private void setNama(String nama){
        nama = "PCX";
        System.out.println("Nama motor adalah: " + nama);
    }
    
}

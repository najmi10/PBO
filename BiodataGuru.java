/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodataguru;
import java.util.Scanner;

/**
 *
 * @author ica
 */
public class BiodataGuru {
    public static void main(String[] args) {
        Scanner caca = new Scanner(System.in);
        BiodataGuru objek = new BiodataGuru();
        int memilih;
        System.out.println("===SELAMAT DATANG DI RUANG GURU===");
        System.out.println("Anda ingin mencari data siapa? \n1. guru 1 \n2. guru 2 \n3. guru 3 \n4. guru 4");
        memilih = caca.nextInt();
        switch(memilih){
            case 1 :
                objek.dataGuru1("");
                break;
            case 2 :
                objek.dataGuru2("");
                break;
            case 3 :
                objek.dataGuru3("");
            case 4 :
                objek.dataGuru4("");
                
        }
    }
        private void dataGuru1(String IoT){
            System.out.println("======Data Guru 1======");
            String nama = "Muhammad Bagus Arifin";
            String lahir = "Kediri, 10 Agustus 1996";
            String alamat = "Jl.Danau Kerinci V G6/G9";
            String pelajaran = "Sistem Komputer dan IoT";
            String hobby = "Membaca buku";
            System.out.println("Nama Guru                  :" + nama);
            System.out.println("Tempat, tanggal lahir      :" + lahir);
            System.out.println("Alamat                     :" + alamat);
            System.out.println("Mata pelajaran yang diajar :" + pelajaran);
            System.out.println("Hobby                      :" + hobby);
        }
        private void dataGuru2(String PKN){
            System.out.println("======Data Guru 2======");
            String nama = "Ria Cahya Kurnia Rahma";
            String lahir = "Malang, 10 April 1991";
            String alamat = "Jl.Teluk Cendrawasih gg.14, Arjosari";
            String pelajaran = "Pendidikan Kewarganegaraan";
            String hobby = "Membaca buku";
            System.out.println("Nama Guru                  :" + nama);
            System.out.println("Tempat, tanggal lahir      :" + lahir);
            System.out.println("Alamat                     :" + alamat);
            System.out.println("Mata pelajaran yang diajar :" + pelajaran);
            System.out.println("Hobby                      :" + hobby);
        }
        private void dataGuru3(String fisika){
            System.out.println("======Data Guru 3======");
            String nama = "Diaur Rahman";
            String lahir = "Madura, 19 April 1988";
            String alamat = "Pulau Madura";
            String pelajaran = "FISIKA ITU MUDAH";
            String hobby = "Olahraga, nonton";
            System.out.println("Nama Guru                  :" + nama);
            System.out.println("Tempat, tanggal lahir      :" + lahir);
            System.out.println("Alamat                     :" + alamat);
            System.out.println("Mata pelajaran yang diajar :" + pelajaran);
            System.out.println("Hobby                      :" + hobby);
        }
        private void dataGuru4(String BK){
            System.out.println("======Data Guru 4======");
            String nama = "Emil Bakhtiar Zulkarnain ";
            String lahir = "Malang, 07 Mei 1983";
            String alamat = "Jl.Sumpil I/30A, Malang";
            String pelajaran = "Bimbingan Konseling";
            String hobby = "Membaca buku";
            System.out.println("Nama Guru                  :" + nama);
            System.out.println("Tempat, tanggal lahir      :" + lahir);
            System.out.println("Alamat                     :" + alamat);
            System.out.println("Mata pelajaran yang diajar :" + pelajaran);
            System.out.println("Hobby                      :" + hobby);
            
            
            
        }
        
        
    }
    


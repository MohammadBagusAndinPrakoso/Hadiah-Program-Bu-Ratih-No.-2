/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadiahprogram_no.pkg2;

/**
 *
 * @author MOKLET1
 */
import java.util.Scanner;
public class HadiahProgram_No2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[]kalkulator = {"X", "Penjumlahan", "Pengurangan", "Perkalian", "Pembagian", "Sisa Bagi"};
        
        System.out.println("Kalkulator Sederhana");
        
        for (int i = 1; i < kalkulator.length; i++){
            System.out.println(i+ ". " +kalkulator[i]);
        }
        
        System.out.print("Pilih Metode Kalkulator : ");
        
        int pilihan = input.nextInt();
        
        System.out.println("Metode yang dipilih : "+kalkulator[pilihan]);
        System.out.println();
        
        int angka1, angka2, hasil;
        
        switch(pilihan){
            case 1:
                System.out.println("1. Penjumlahan");
                System.out.print("Masukkan angka pertama : ");
                angka1 = input.nextInt();
                System.out.print("Masukkan angka kedua   : ");
                angka2 = input.nextInt();
        
                hasil=angka1+angka2;
                System.out.println("Hasil : "+hasil);
                break;
                
            case 2:
                System.out.println("2. Pengurangan");
                 System.out.print("Masukkan angka pertama : ");
                angka1 = input.nextInt();
                System.out.print("Masukkan angka kedua   : ");
                angka2 = input.nextInt();
        
                hasil=angka1-angka2;
                System.out.println("Hasil : "+hasil);
                break;
            
            case 3:
                System.out.println("2. Pengurangan");
                 System.out.print("Masukkan angka pertama : ");
                angka1 = input.nextInt();
                System.out.print("Masukkan angka kedua   : ");
                angka2 = input.nextInt();
        
                hasil=angka1-angka2;
                System.out.println("Hasil : "+hasil);
                break;
                
            case 4:
                System.out.println("4. Pembagian");
                 System.out.print("Masukkan angka pertama : ");
                angka1 = input.nextInt();
                System.out.print("Masukkan angka kedua   : ");
                angka2 = input.nextInt();
        
                hasil=angka1/angka2;
                System.out.println("Hasil : "+hasil);
                break;
                
            case 5:
                System.out.println("5. Sisa Bagi");
                 System.out.print("Masukkan angka pertama : ");
                angka1 = input.nextInt();
                System.out.print("Masukkan angka kedua   : ");
                angka2 = input.nextInt();
        
                hasil=angka1%angka2;
                System.out.println("Hasil : "+hasil);
                break;
            
            default:
        }
        
        
    }
}

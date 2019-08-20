package praktikum2;

import java.util.Scanner;

public class Suhu {
    
    public static void main(String[] args) {
        // deklarasi
        Double fahrenheit;
        int celcius;
        
       
        // mebuat scanner baru
        Scanner baca = new Scanner(System.in);
        
        // Input
        System.out.println("Suhu  Celcius ke Fahrenheit");
        System.out.print("Celcius: ");
        celcius = baca.nextInt();
        
        // Proses
        fahrenheit = Double.valueOf((9 * celcius / 5) + 32);
        
        // Output
        System.out.println("F: " + fahrenheit);
    }
}
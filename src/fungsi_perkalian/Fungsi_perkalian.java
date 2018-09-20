package fungsi_perkalian;

import java.util.Scanner;

public class Fungsi_perkalian {
    public static void main(String[] args) {
        // TODO code application logic here
        kontrol fungsiperkalian = new kontrol(); //instance
        Scanner masuk = new Scanner(System.in);
        System.out.print("Bilangan 1: ");
        int nilai = masuk.nextInt();
        System.out.print("Bilangan 2: ");
        int nilai2 = masuk.nextInt();
        System.out.println("perkalian tanpa looping = " +fungsiperkalian.perkalian(nilai, nilai2));
        System.out.println("perkalian dengan looping = " +fungsiperkalian.perkalian_looping(nilai, nilai2));
    }
    //coba
    //coba2
    //coba3
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konversibilangan;

/**
 *
 * @author Maulidar Rohmatus S
 */
import java.util.Scanner;

public class KonversiBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih operasi:");
            System.out.println("1. Biner ke Desimal");
            System.out.println("2. Desimal ke Biner");
            System.out.println("3. Biner ke Heksadesimal");
            System.out.println("4. Heksadesimal ke Biner");
            System.out.println("5. Desimal ke Heksadesimal");
            System.out.println("6. Heksadesimal ke Desimal");
            System.out.println("0. Keluar");

            int pilihan = input.nextInt();

            if (pilihan == 0) {
                System.out.println("Program selesai.");
                break;
            }

            input.nextLine();

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan angka biner: ");
                    String biner = input.nextLine();
                    int desimal = Integer.parseInt(biner, 2);
                    System.out.println("Hasil konversi ke desimal: " + desimal);
                }
                case 2 -> {
                    System.out.print("Masukkan angka desimal: ");
                    int desimalInput = input.nextInt();
                    String binerOutput = Integer.toBinaryString(desimalInput);
                    System.out.println("Hasil konversi ke biner: " + binerOutput);
                }
                case 3 -> {
                    System.out.print("Masukkan angka biner: ");
                    String binerInput = input.nextLine();
                    int desimalFromBiner = Integer.parseInt(binerInput, 2);
                    String heksadesimal = Integer.toHexString(desimalFromBiner);
                    System.out.println("Hasil konversi ke heksadesimal: " + heksadesimal);
                }
                case 4 -> {
                    System.out.print("Masukkan angka heksadesimal: ");
                    String heksadesimalInput = input.nextLine();
                    int desimalFromHeksadesimal = Integer.parseInt(heksadesimalInput, 16);
                    String binerFromHeksadesimal = Integer.toBinaryString(desimalFromHeksadesimal);
                    System.out.println("Hasil konversi ke biner: " + binerFromHeksadesimal);
                }
                case 5 -> {
                    System.out.print("Masukkan angka desimal: ");
                    int desimalInput2 = input.nextInt();
                    String heksadesimalOutput = Integer.toHexString(desimalInput2);
                    System.out.println("Hasil konversi ke heksadesimal: " + heksadesimalOutput);
                }
                case 6 -> {
                    System.out.print("Masukkan angka heksadesimal: ");
                    String heksadesimalInput2 = input.nextLine();
                    int desimalFromHeksadesimal2 = Integer.parseInt(heksadesimalInput2, 16);
                    System.out.println("Hasil konversi ke desimal: " + desimalFromHeksadesimal2);
                }
                default -> System.out.println("Pilihan tidak valid. Silakan pilih operasi yang sesuai.");
            }
        }
    }
}
import java.util.Scanner;

/**
 * Kelas KonversiMassaJenis digunakan untuk melakukan konversi massa jenis antara Gram dan Kilogram.
 * Program ini memungkinkan pengguna untuk memasukkan jenis konversi yang mereka inginkan, yaitu:
 * 1. Gram ke Kilogram
 * 2. Kilogram ke Gram
 * Pengguna dapat mengulangi konversi sebanyak yang mereka inginkan hingga mereka memilih untuk keluar.
 *
 */
public class KonversiMassaJenis {
    /**
     * Metode utama program. Memungkinkan pengguna untuk memilih jenis konversi dan
     * melakukan konversi massa jenis sesuai dengan pilihan mereka.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        // Inisialisasi objek Scanner untuk menerima input dari pengguna.
        Scanner input = new Scanner(System.in);
        // Variabel boolean untuk menentukan apakah program selesai atau tidak.
        boolean selesai = false;

        // Loop utama program.
        while (!selesai) {
            System.out.println("Pilih jenis konversi:");
            System.out.println("1. Gram ke Kilogram");
            System.out.println("2. Kilogram ke Gram");

            // Membaca pilihan pengguna.
            int pilihan = input.nextInt();

            // Menangani pilihan pengguna menggunakan instruksi switch.
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan massa jenis dalam Gram: ");
                    double Gram = input.nextDouble();
                    double Kg = konversiGram(Gram);
                    System.out.println("Massa jenis dalam Kilogram: " + Kg);
                    break;
                case 2:
                    System.out.print("Masukkan massa jenis dalam Kilogram: ");
                    double Kilogram = input.nextDouble();
                    Gram = konversiKilogram(Kilogram);
                    System.out.println("Massa jenis dalam Gram: " + Gram);
                    break;
                case 0:
                    // Keluar dari program jika pengguna memilih 0.
                    selesai = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    /**
     * Metode untuk mengonversi massa jenis dari Gram ke Kilogram.
     *
     * @param Gram Massa jenis dalam Gram yang akan dikonversi.
     * @return Massa jenis dalam Kilogram.
     */
    public static double konversiGram(double Gram) {
        return Gram / 1000;
    }

    /**
     * Metode untuk mengonversi massa jenis dari Kilogram ke Gram.
     *
     * @param Kilogram Massa jenis dalam Kilogram yang akan dikonversi.
     * @return Massa jenis dalam Gram.
     */
    public static double konversiKilogram(double Kilogram) {
        return Kilogram * 1000;
    }
}

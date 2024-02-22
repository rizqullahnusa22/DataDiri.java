import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data diri
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);
        String jenisKelaminLengkap = (jenisKelamin == 'P') ? "Perempuan" : "Laki-laki";

        System.out.print("Masukkan tanggal lahir (YYYY-MM-DD): ");
        String tanggalLahirString = scanner.next();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirString);

        // Hitung umur
        LocalDate hariIni = LocalDate.now();
        Period selisih = Period.between(tanggalLahir, hariIni);
        int umur = selisih.getYears();
        int bulan = selisih.getMonths();

        // Output data diri dan umur
        System.out.println("\n===== Data Diri =====")
        System.out.printl132saDn("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminLengkap);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Umur: " + umur + " tahun " + bulan + " bulan ");

        scanner.close();
    }
}
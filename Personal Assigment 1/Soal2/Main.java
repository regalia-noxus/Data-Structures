package Soal2; // Package digunakan untuk mengelompokkan kelas-kelas terkait karena ini adalah soal 2, maka package dinamai Soal2

import java.util.Scanner; // Scanner digunakan untuk menerima input dari user melalui keyboard intinya agar program bisa interaktif
import java.util.Locale; // Locale digunakan untuk mengatur format desimal agar sesuai standar internasional (titik sebagai pemisah desimal)

public class Main {
    public static void main(String[] args) {
        // Inisialisasi array penampung data awal 5 mahasiswa
        Mahasiswa[] daftar = new Mahasiswa[5];
        daftar[0] = new Mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75);
        daftar[1] = new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40);
        daftar[2] = new Mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90);
        daftar[3] = new Mahasiswa("Joni Suhartono", "2440004", "Teknik Industri", 3.00);
        daftar[4] = new Mahasiswa("Bulan Suci", "2440005", "Akuntansi", 3.20);

        // Menyiapkan scanner untuk menerima input dari user melalui keyboard jadi bisa diketik langsung di console
        Scanner input = new Scanner(System.in);
        // Mengatur parsing desimal menggunakan format titik (.) sesuai standar internasional
        input.useLocale(Locale.US);

        // input NIM mahasiswa yang ingin diupdate
        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String cariNim = input.nextLine();

        // input IPK baru untuk mahasiswa yang bersangkutan
        System.out.print("Masukkan IPK baru: ");
        double ipkBaru = Double.parseDouble(input.nextLine());

        // Apakah variabel ditemukan sudah ada mahasiswa dengan NIM yang dicari? Jika tidak, maka akan menampilkan pesan error. Jika iya, maka akan menampilkan data mahasiswa yang sudah diperbarui
        boolean ditemukan = false;

        // Mencari objek mahasiswa yang sesuai di dalam array
        for (Mahasiswa mhs : daftar) {
            if (mhs.getNim().equals(cariNim)) {
                // Panggil method updateIpk milik objek yang bersangkutan dari array untuk memperbarui IPK mahasiswa tersebut
                mhs.updateIpk(ipkBaru);
                ditemukan = true;

                // Format output agar lebih rapi dan informatif
                System.out.println("Data berhasil diperbarui!\n");
                System.out.println("=== Data Mahasiswa ===");
                mhs.tampilkanInfo();
                break; // Keluar dari loop setelah data ditemukan dan diperbarui
            }
        }
        // ini adalah kondisi jika mahasiswa dengan NIM yang dicari tidak ditemukan di dalam array, maka akan menampilkan pesan error
        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + cariNim + " tidak ditemukan.");
        }

        // Menutup resource scanner setelah selesai digunakan
        input.close();
    }
}
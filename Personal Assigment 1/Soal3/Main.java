package Soal3;

public class Main {
    public static void main(String[] args) {
        // Alokasi memori array untuk menampung referensi objek [LN 01, hlm. 8]
        Mahasiswa[] daftar = new Mahasiswa[5];

        // Mengisi objek ke array
        daftar[0] = new Mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75);
        daftar[1] = new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40);
        daftar[2] = new Mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90);
        daftar[3] = new Mahasiswa("Joni Suhartono", "2440004", "Teknik Industri", 3.00);
        daftar[4] = new Mahasiswa("Bulan Suci", "2440005", "Akuntansi", 3.20);

        System.out.println("=== Data Mahasiswa ===");

        // OPSI A di soal 3 contoh outputnya adalah menampilkan data mahasiswa tertentu, misal Citra Lestari. Maka kita bisa langsung memanggil method tampilkanInfo() pada indeks array yang sesuai.
        // Citra Lestari berada pada indeks array ke-2
        daftar[2].tampilkanInfo();

        System.out.println();
        System.out.println("=== Data Mahasiswa Semuanya ===");

        // OPSI B fungsinya untuk menampilkan seluruh data mahasiswa yang ada di array. Kalau dosenmu minta seluruh isi array dicetak lengkap, gunakan loop ini:
        for (Mahasiswa mhs : daftar) {
            mhs.tampilkanInfo();
            System.out.println();
        }
        
    }
}
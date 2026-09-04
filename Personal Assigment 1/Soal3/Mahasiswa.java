package Soal3; // Package digunakan untuk mengelompokkan kelas-kelas terkait karena ini adalah soal 3, maka package dinamai Soal3

import java.util.Locale; // Locale digunakan untuk mengatur format desimal agar sesuai standar internasional (titik sebagai pemisah desimal)

public class Mahasiswa {
    // Atribut tetap diproteksi private (Enkapsulasi) fungsinya agar data tidak bisa diubah secara langsung dari luar kelas, menjaga integritas data.
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;

    // Constructor untuk inisialisasi state objek 
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // Method mengecek kelulusan dari Soal 2
    public String cekKelulusan() {
        if (this.ipk >= 3.00) {
            return "Lulus";
        } else {
            return "Belum Lulus";
        }
    }

    // Method Soal 3: Logika penentuan predikat akademik bertingkat 
    // Fungsi utamanya adalah untuk memberikan predikat akademik berdasarkan nilai IPK mahasiswa, yang bisa digunakan untuk menilai prestasi akademik mereka.
    public String hitungPredikat() {
        if (this.ipk >= 3.75) { // Artinya mahasiswa dianggap berprestasi tinggi jika IPK >= 3.75, jika kurang dari itu maka akan diberikan predikat yang sesuai dengan rentang nilai IPK mereka.
            return "Dengan Pujian"; // Mengembalikan string "Dengan Pujian" jika IPK >= 3.75
        } else if (this.ipk >= 3.50) { // Artinya mahasiswa dianggap berprestasi baik jika IPK >= 3.50, jika kurang dari itu maka akan diberikan predikat yang sesuai dengan rentang nilai IPK mereka.
            return "Sangat Memuaskan"; // Mengembalikan string "Sangat Memuaskan" jika IPK >= 3.50
        } else if (this.ipk >= 3.00) { // Artinya mahasiswa dianggap berprestasi cukup jika IPK >= 3.00, jika kurang dari itu maka akan diberikan predikat yang sesuai dengan rentang nilai IPK mereka.
            return "Memuaskan";// Mengembalikan string "Memuaskan" jika IPK >= 3.00
        } else {
            return "Perlu Perbaikan"; // ini kondisi jika mahasiswa dianggap belum berprestasi jika IPK < 3.00, maka akan diberikan predikat "Perlu Perbaikan" untuk mendorong mereka meningkatkan prestasi akademik mereka.
        }
    }

    // Method cetak lengkap yang menampilkan data, status, dan predikat 
    // fungsi utama nya adalah untuk menampilkan informasi lengkap mahasiswa, termasuk nama, NIM, jurusan, IPK, status kelulusan, dan predikat akademik mereka.
    public void tampilkanInfo() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.nim);
        System.out.println("Jurusan: " + this.jurusan);
        System.out.printf(Locale.US, "IPK: %.2f%n", this.ipk);
        System.out.println("Status: " + cekKelulusan());
        System.out.println("Predikat: " + hitungPredikat()); // Menampilkan predikat akademik
    }

    // Getter & Setter pendukung enkapsulasi 
    public double getIpk() { return ipk; }
    public void setIpk(double ipk) { this.ipk = ipk; }
    public String getNim() { return nim; }
}

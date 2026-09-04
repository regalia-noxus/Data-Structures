package Soal2; // Package digunakan untuk mengelompokkan kelas-kelas terkait karena ini adalah soal 2, maka package dinamai Soal2

import java.util.Locale; // Locale digunakan untuk mengatur format desimal agar sesuai standar internasional (titik sebagai pemisah desimal)

public class Mahasiswa {
    // Semua atribut dibungkus rapi dengan private (Enkapsulasi), private berarti hanya bisa diakses dari dalam kelas ini saja, tidak bisa diakses langsung dari luar kelas. Ini adalah prinsip OOP yang baik untuk menjaga integritas data.
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk; // Atribut IPK kini private 

    // Constructor untuk inisialisasi state awal objek
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // Getter dan Setter untuk membaca dan memodifikasi IPK secara terkontrol kalau tidak ada ini, maka IPK bisa diubah secara langsung dari luar kelas, yang bisa menyebabkan inkonsistensi data.
    public double getIpk() {
        return this.ipk; // Metode akses / accessor fungsinya hanya untuk membaca nilai IPK, tidak bisa mengubahnya langsung dari luar kelas.
    }

    public void setIpk(double ipk) {
        this.ipk = ipk; // Metode pembaruan / update fungsinya untuk mengubah nilai IPK, tapi tetap melalui metode ini agar bisa dikontrol dan divalidasi jika perlu.
    }

    // Method untuk mengecek status kelulusan berdasarkan aturan nilai IPK
    public String cekKelulusan() {
        // Percabangan logika kondisi kelulusan 
        if (this.ipk >= 3.00) { // artinya mahasiswa dianggap lulus jika IPK >= 3.00, jika kurang dari itu maka dianggap belum lulus
            return "Lulus"; // Mengembalikan string "Lulus" jika IPK >= 3.00
        } else {
            return "Belum Lulus"; // Mengembalikan string "Belum Lulus" jika IPK < 3.00
        }
    }

    // Method khusus updateIpk untuk memperbarui data mahasiswa
    public void updateIpk(double ipkBaru) {
        // diteruskan ke setter agar konsisten dengan practice OOP artinya kita tidak mengubah atribut langsung dari luar kelas, tapi melalui metode yang sudah disediakan.
        setIpk(ipkBaru);
    }

    // Menampilkan informasi detail beserta status kelulusan terkini
    public void tampilkanInfo() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.nim);
        System.out.println("Jurusan: " + this.jurusan);
        System.out.printf(Locale.US, "IPK: %.2f%n", this.ipk);
        System.out.println("Status: " + cekKelulusan());
    }

    // Getter untuk NIM agar bisa dicocokkan saat pencarian data di array
    public String getNim() {
        return this.nim;
    }
}
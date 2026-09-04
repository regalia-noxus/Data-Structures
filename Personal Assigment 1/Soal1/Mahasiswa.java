package Soal1; // Package untuk mengelompokkan class Mahasiswa dan Main

import java.util.Locale; // Import Locale fungsinya untuk format output IPK dengan titik desimal

// Class dibuat sebagai blueprint untuk objek Mahasiswa, yang memiliki atribut nama, nim, jurusan, dan ipk
public class Mahasiswa {
    // Atribut privat demi prinsip data protection / enkapsulasi
    private String nama; // Nama mahasiswa
    private String nim; // Nomor Induk Mahasiswa (NIM) unik
    private String jurusan; // Jurusan/program studi mahasiswa
    private double ipk; // Indeks Prestasi Kumulatif (IPK) mahasiswa

    // Constructor untuk inisialisasi state awal objek saat dibuat
    //Fungsinya untuk mengisi data mahasiswa saat objek Mahasiswa diinstansiasi
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // Method untuk menampilkan rincian data ke konsol
    public void tampilkanInfo() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.nim);
        System.out.println("Jurusan: " + this.jurusan);
        // Format Locale.US jadi memastikan pemisah desimal pakai titik dan 2 desimal
        System.out.printf(Locale.US, "IPK: %.2f%n", this.ipk);
    }

    //kenapa dibuat getter dan setter? karena prinsip enkapsulasi, agar atribut private bisa diakses dan dimodifikasi dari luar class dengan aman
    // Getter dan Setter untuk masing-masing atribut
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public String getNim() { return nim; }
    public void setNim(String nim) { this.nim = nim; }
    public String getJurusan() { return jurusan; }
    public void setJurusan(String jurusan) { this.jurusan = jurusan; }
    public double getIpk() { return ipk; }
    public void setIpk(double ipk) { this.ipk = ipk; }
}
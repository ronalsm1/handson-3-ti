public class MathOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Matematika
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk berlatih
         * operator aritmatika dan memahami berbagai operasi numerik.
         */

        // ===== OPERATOR ARITMATIKA DASAR =====
        System.out.println("=== OPERATOR ARITMATIKA DASAR ===");

        // Latihan 1: Berlatih operasi aritmatika dasar
        // - Deklarasikan dua integer: num1 = 25, num2 = 4
        int num1 = 25;
        int num2 = 4;

        // - Hitung dan simpan hasil penjumlahan num1 dan num2
        int jumlah;
        jumlah = num1 + num2;

        // - Hitung dan simpan hasil pengurangan num1 dan num2
        int kurang;
        kurang = num1 - num2;

        // - Hitung dan simpan hasil perkalian num1 dan num2
        int kali;
        kali = num1 * num2;

        // - Hitung dan simpan hasil pembagian num1 dibagi num2 (pembagian integer)
        int bagi;
        bagi = num1 / num2;

        // - Hitung dan simpan sisa bagi num1 dibagi num2 (modulus)
        int modulo;
        modulo = num1 % num2;

        // - Print semua hasil dengan label yang deskriptif
        System.out.println("Hasil penjumlahan: " + num1 + " + " + num2 + " = " + jumlah);
        System.out.println("Hasil pengurangan: " + num1 + " - " + num2 + " = " + kurang);
        System.out.println("Hasil perkalian: " + num1 + " * " + num2 + " = " + kali);
        System.out.println("Hasil pembagian: " + num1 + " / " + num2 + " = " + bagi);
        System.out.println("Sisa pembagian: " + num1 + " % " + num2 + " = " + modulo);

        // ===== PEMBAGIAN INTEGER VS FLOATING-POINT =====
        System.out.println("\\n=== PEMBAGIAN INTEGER VS FLOATING-POINT ===");

        // Latihan 2: Jelajahi berbagai jenis pembagian
        // - Lakukan pembagian integer: 17 / 5 dan simpan hasilnya
        int ang1 = 17;
        int ang2 = 5;
        double ngka1 = 17.0;
        int bagiLagi = ang1 / ang2;

        // - Lakukan pembagian floating-point: 17.0 / 5 dan simpan hasilnya
        double bagiPoint = ngka1 / ang2;

        // - Konversi integer ke double sebelum pembagian: (double)17 / 5 dan simpan hasilnya
        double bagiDouble = (double)ang1 / ang2;

        // - Print ketiga hasil pembagian dan amati perbedaannya
        System.out.println("Pembagian integer: " + bagiLagi);
        System.out.println("Pembagian floating-point: " + bagiPoint);
        System.out.println("Konversi int ke double sebelum bagi: " + bagiDouble);

        // ===== KALKULASI PRAKTIS =====
        System.out.println("\\n=== KALKULASI PRAKTIS ===");

        // Latihan 3: Selesaikan masalah dunia nyata menggunakan operator aritmatika
        // - Hitung luas persegi panjang dengan panjang 12.5 dan lebar 8.3
        double panjang = 12.5;
        double lebar = 8.3;

        double luasSegi = panjang * lebar;

        // - Hitung keliling persegi panjang yang sama
        double keliling = 2 * (panjang + lebar);

        // - Hitung total harga: 3 barang dengan harga $15.99 masing-masing, dengan pajak 8%
        double totalHarga = 15.99 * 3 ;
        double pajak = totalHarga * 0.08;
        double totalTambahPajak = totalHarga + pajak;

        // - Konversi suhu dari Celsius ke Fahrenheit menggunakan rumus: F = (C * 9/5) + 32
        // Gunakan Celsius = 25
        int celcius = 25;
        int fahrenheit = (celcius * 9 / 5) + 32;

        // - Hitung berapa minggu penuh dalam 50 hari dan berapa hari sisanya
        int hari = 50;
        int minggu = hari / 7;
        int sisaHari = hari % 7;

        // - Print semua kalkulasi dengan label dan format yang sesuai
        System.out.println("Luas persegi panjang: " + panjang + " * " + lebar + " = " + luasSegi);
        System.out.println("Keliling persegi panjang: " + "2 * (" + panjang + " + " + lebar + ") = " + keliling);
        System.out.println("Total harga 3 barang dengan pajak: " + totalTambahPajak);
        System.out.println("Konversi suhu dari C ke F: " + "(" + celcius + " * 9 / 5) + 32 = " + fahrenheit);
        System.out.println("Minggu penuh dalam 50 hari: " + minggu + " minggu dan sisa " + sisaHari + " hari");

        // ===== KALKULASI KOMPLEKS =====
        System.out.println("\\n=== KALKULASI KOMPLEKS ===");

        // Latihan 4: Berlatih ekspresi matematika yang kompleks
        // - Hitung jarak menggunakan rumus: jarak = kecepatan * waktu
        // Gunakan kecepatan = 65.5 km/jam dan waktu = 2.75 jam
        double kecepatan = 65.5;
        double waktu = 2.75;
        double jarak = kecepatan * waktu;

        // - Hitung bunga majemuk menggunakan rumus sederhana: jumlah = pokok * (1 + suku_bunga) ^ waktu
        // Gunakan Math.pow() untuk perpangkatan
        // pokok = 1000, suku_bunga = 0.05 (5%), waktu = 3 tahun
        double pokok = 1000;
        double suku_bunga = 0.05;
        double waktu2 = 3;
        double bungaMajemuk = pokok * Math.pow((1 + suku_bunga), waktu2);

        // - Hitung rata-rata dari lima nilai ujian: 85, 92, 78, 96, 88
        double totalNilai = 85 + 92 + 78 + 96 + 88;
        double rataRata = totalNilai / 5;

        // - Print semua hasil dengan format yang proper (pertimbangkan menggunakan String.format())
        System.out.println("Perhitungan jarak: " + kecepatan + " * " + waktu + " = " + jarak);
        System.out.println("Perhitungan bunga majemuk: 1000 * (1 + 0.05)^3 = " + bungaMajemuk);
        System.out.println("Perhitungan rata-rata 5 nilai: (85+92+78+96+88) / 2 = " + rataRata);
    }
}

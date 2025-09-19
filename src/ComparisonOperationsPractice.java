public class ComparisonOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Perbandingan
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * operator perbandingan dan memahami perilakunya dengan tipe data berbeda.
         */

        // ===== PERBANDINGAN NUMERIK DASAR =====
        System.out.println("=== PERBANDINGAN NUMERIK DASAR ===");

        // Latihan 1: Berlatih semua operator perbandingan dengan integers
        // - Buat dua variabel integer: firstNum = 25, secondNum = 18
        int firstNum = 25;
        int secondNum = 18;

        // - Bandingkan firstNum > secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("firstNum > secondNum: " + (firstNum > secondNum));

        // - Bandingkan firstNum < secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("firstNum < secondNum: " + (firstNum < secondNum));

        // - Bandingkan firstNum >= secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("firstNum >= secondNum: " + (firstNum >= secondNum));

        // - Bandingkan firstNum <= secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("firstNum <= secondNum: " + (firstNum <= secondNum));

        // - Bandingkan firstNum == secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("firstNum == secondNum: " + (firstNum == secondNum));

        // - Bandingkan firstNum != secondNum dan print hasilnya dengan pesan deskriptif
        System.out.println("firstNum != secondNum: " + (firstNum != secondNum));

        // ===== PERBANDINGAN FLOATING-POINT =====
        System.out.println("\\n=== PERBANDINGAN FLOATING-POINT ===");

        // Latihan 2: Bekerja dengan perbandingan angka floating-point
        // - Buat dua variabel double: price1 = 19.99, price2 = 20.0
        double price1 = 19.99;
        double price2 = 20.0;

        // - Bandingkan harga mana yang lebih murah menggunakan operator perbandingan yang sesuai
        boolean cheaper = price1 < price2;
        System.out.println("Harga 1 lebih murah kah? " + cheaper);

        // - Periksa apakah perbedaan antara harga kurang dari 1.0
        boolean kurang = (price2 - price1) < 1.0;
        System.out.println("Selisih dua harga itu kurang dari 1.0 kah? " + kurang);

        // - Buat skenario dimana dua nilai double seharusnya "sama" tetapi tidak karena presisi
        // Contoh: 0.1 + 0.2 dibandingkan dengan 0.3
        boolean samaOrTidak = 19.99 == 20.0;
        System.out.println("Sama kah nilai 19.99 dengan 20.0? " + samaOrTidak);

        // ===== PERBANDINGAN KARAKTER =====
        System.out.println("\\n=== PERBANDINGAN KARAKTER ===");

        // Latihan 3: Bandingkan karakter menggunakan operator perbandingan
        // - Buat dua variabel char: letter1 = 'A', letter2 = 'B'
        char letter1 = 'A';
        char letter2 = 'B';

        // - Bandingkan letter1 < letter2 dan jelaskan mengapa hasilnya masuk akal (nilai ASCII)
        System.out.println("letter1 < letter2: " + (letter1 < letter2));

        // - Bandingkan huruf kecil dengan huruf besar dan amati hasilnya
        char kecilA = 'a';
        char kecilB = 'b';
        System.out.println("kecilA > letter1: " + (kecilA > letter1));
        System.out.println("kecilB < letter2: " + (kecilB < letter2));

        // - Periksa apakah suatu karakter adalah digit dengan membandingkannya dengan '0' dan '9'
        char enam = '6';
        boolean apaDigit = enam >= '0' && enam <= '9';
        System.out.println("Apakah " + enam + " adalah digit? " + apaDigit);

        // ===== PERBANDINGAN STRING =====
        System.out.println("\\n=== PERBANDINGAN STRING ===");

        // Latihan 4: Pahami jebakan perbandingan string dan metode yang benar
        // - Buat dua variabel String dengan konten yang sama: name1 = "Java", name2 = "Java"
        String name1 = "Java";
        String name2 = "Java";

        // - Bandingkan name1 == name2 dan print hasilnya
        System.out.println("name1 == name2: " + (name1 == name2));

        // - Buat string lain: name3 = new String("Java")
        String name3 = new String("Java");

        // - Bandingkan name1 == name3 dan print hasilnya - jelaskan mengapa berbeda dari di atas
        System.out.println("name1 == name3: " + (name1 == name3));

        // - Gunakan metode .equals() untuk membandingkan name1 dan name3 dengan benar
        System.out.println("name1.equals(name3): " + name1.equals(name3));

        // - Demonstrasikan perbandingan case-sensitive dengan .equals()
        String name4 = "java";
        System.out.println("name1.equals(name4): " + name1.equals(name4));

        // - Demonstrasikan perbandingan case-insensitive dengan .equalsIgnoreCase()
        System.out.println("name1.equalsIgnoreCase(name4): " + name1.equalsIgnoreCase(name4));

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\\n=== APLIKASI PRAKTIS ===");

        // Latihan 5: Gunakan perbandingan dalam skenario dunia nyata
        // - Buat variabel untuk pengecekan nilai siswa
        // grade = 85, passingGrade = 60, honorRoll = 90
        int grade = 85;
        int passingGrade = 60;
        int honorRoll = 90;

        // - Periksa apakah siswa lulus menggunakan operator perbandingan
        boolean lulusGak = grade >= passingGrade;
        System.out.println("Siswa lulus ga? " + lulusGak);

        // - Periksa apakah siswa memenuhi syarat untuk honor roll
        boolean memenuhiGak = grade >= honorRoll;
        System.out.println("Siswa memenuhi syarat ga? " + memenuhiGak);

        // - Buat skenario verifikasi usia
        // age = 17, drivingAge = 16, votingAge = 18, drinkingAge = 21
        int age = 17;
        int drivingAge = 16;
        int votingAge = 18;
        int drinkingAge = 21;

        // - Periksa kelayakan untuk mengemudi, memilih, dan minum menggunakan perbandingan
        System.out.println("Layak mengemudi gak? " + (age >= drivingAge));
        System.out.println("Layak memilih gak? " + (age >= votingAge));
        System.out.println("Layak minum-minum gak? " + (age >= drinkingAge));

        // Latihan 6: Skenario shopping dan discount
        // - Buat variabel untuk skenario belanja
        // originalPrice = 100, discountThreshold = 50, customerAge = 65, seniorAge = 60
        int originalPrice = 100;
        int discountThreshold = 50;
        int customerAge = 65;
        int seniorAge = 60;

        // - Periksa apakah pembelian memenuhi syarat untuk diskon bulk (harga > threshold)
        System.out.println("Memenuhi syarat untuk diskon bulk ga? " + (originalPrice > discountThreshold));

        // - Periksa apakah pelanggan memenuhi syarat untuk diskon senior
        System.out.println("Memenuhi syarat untuk diskon senior ga? " + (customerAge >= 60));

        // - Gabungkan kondisi untuk menentukan kelayakan akhir
        System.out.println("Layak dapat diskon ga? " + ((originalPrice > discountThreshold) || (customerAge >= 60)));

        // ===== PENGUJIAN BATAS =====
        System.out.println("\\n=== PENGUJIAN BATAS ===");

        // Latihan 7: Test edge cases dan kondisi batas
        // - Buat variabel 'score' dengan nilai 100
        int score = 100;

        // - Periksa apakah score berada dalam rentang yang valid (0 sampai 100) menggunakan dua operasi perbandingan
        System.out.println("Apakah 100 berada dalam rentang 0-100? " + ((score >= 0) && (score <= 100)));

        // - Test nilai batas: apa yang terjadi dengan score = 0, score = 100, score = -1, score = 101
        score = 0;
        System.out.println("Apakah 0 berada dalam rentang 0-100? " + ((score >= 0) && (score <= 100)));
        score = 100;
        System.out.println("Apakah 100 berada dalam rentang 0-100? " + ((score >= 0) && (score <= 100)));
        score = -1;
        System.out.println("Apakah -1 berada dalam rentang 0-100? " + ((score >= 0) && (score <= 100)));
        score = 101;
        System.out.println("Apakah 101 berada dalam rentang 0-100? " + ((score >= 0) && (score <= 100)));

        // - Buat pengecekan rentang suhu (rentang valid: -10 sampai 40 derajat Celsius)
        int suhu = 38;
        System.out.println("Apakah suhu 38°C berada dalam rentang -10 sampai 40°C? " + ((suhu >= -10) && (suhu <= 40)));

        // Latihan 8: Rantai perbandingan dan kondisi kompleks
        // - Buat variabel: height = 175, minHeight = 160, maxHeight = 200
        int height = 175;
        int minHeight = 160;
        int maxHeight = 200;

        // - Periksa apakah tinggi berada dalam rentang yang dapat diterima menggunakan operator perbandingan
        System.out.println("Apakah tinggi 175 berada dalam rentang 160-200? " + ((height >= minHeight) && (height <= maxHeight)));

        // - Buat sistem penilaian menggunakan beberapa perbandingan:
        // score >= 90: "A", score >= 80: "B", score >= 70: "C", score >= 60: "D", selainnya: "F"
        score = 98;
        String nilaiHuruf;
        if (score >= 90) {
            nilaiHuruf = "A";
        } else if (score >= 80) {
            nilaiHuruf = "B";
        } else if (score >= 70) {
            nilaiHuruf = "C";
        } else if (score >= 60) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "F";
        }
        System.out.println("Nilai kamu: " + nilaiHuruf);
    }
}

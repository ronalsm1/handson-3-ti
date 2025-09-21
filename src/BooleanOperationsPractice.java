public class BooleanOperationsPractice {
    public static boolean expensiveCheckSatu() {
        return false;
    }
    public static boolean expensiveCheckDua() {
        return true;
    }
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Boolean
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * operator boolean, operasi logika, dan evaluasi short-circuit.
         */

        // ===== OPERATOR BOOLEAN DASAR =====
        System.out.println("=== OPERATOR BOOLEAN DASAR ===");

        // Latihan 1: Berlatih operator AND (&&)
        // - Buat variabel boolean: isLoggedIn = true, hasPermission = false
        boolean isLoggedIn = true;
        boolean hasPermission = false;

        // - Gunakan operator AND untuk mengecek apakah user bisa akses admin panel (kedua kondisi harus true)
        boolean bisaAkses = isLoggedIn && hasPermission;
        System.out.println("User bisa akses admin panel ga? " + bisaAkses);

        // - Test keempat kombinasi operator AND:
        // true && true, true && false, false && true, false && false
        System.out.println("true && true: " + (true && true));
        System.out.println("true && false: " + (true && false));
        System.out.println("false && true: " + (false && true));
        System.out.println("false && false: " + (false && false));

        // Latihan 2: Berlatih operator OR (||)
        // - Buat variabel boolean: isWeekend = false, isHoliday = true
        boolean isWeekend = false;
        boolean isHoliday = true;

        // - Gunakan operator OR untuk mengecek apakah hari libur (salah satu kondisi bisa true)
        boolean hariLibur = isWeekend || isHoliday;
        System.out.println("Apakah ini hari libur? " + hariLibur);

        // - Test keempat kombinasi operator OR:
        // true || true, true || false, false || true, false || false
        System.out.println("true || true: " + (true || true));
        System.out.println("true || false: " + (true || false));
        System.out.println("false || true: " + (false || true));
        System.out.println("false || false: " + (false || false));

        // Latihan 3: Berlatih operator NOT (!)
        // - Buat variabel boolean: isRaining = true
        boolean isRaining = true;

        // - Gunakan operator NOT untuk membuat variabel 'isSunny'
        boolean isSunny = !isRaining;
        System.out.println("Cerah ga di luar? " + isSunny);

        // - Terapkan operator NOT dua kali (!(!isRaining)) dan amati hasilnya
        System.out.println("Hasil dari !(!isRaining): " + (!(!isRaining)));

        // - Gunakan NOT dengan perbandingan: !(5 > 3) dan jelaskan hasilnya
        System.out.println("Hasil dari !(5 > 3): " + (!(5 > 3)));

        // ===== EKSPRESI BOOLEAN GABUNGAN =====
        System.out.println("\\n=== EKSPRESI BOOLEAN GABUNGAN ===");

        // Latihan 4: Gabungkan beberapa operator boolean
        // - Buat variabel untuk evaluasi siswa
        // attendanceGood = true, gradesHigh = false, behaviorGood = true
        boolean attendanceGood = true;
        boolean gradesHigh = false;
        boolean behaviorGood = true;

        // - Buat ekspresi untuk "siswa outstanding": attendanceGood && gradesHigh && behaviorGood
        boolean siswaOutstanding = attendanceGood && gradesHigh && behaviorGood;
        System.out.println("Siswa outstanding kah ini? " + siswaOutstanding);

        // - Buat ekspresi untuk "siswa memuaskan": attendanceGood && (gradesHigh || behaviorGood)
        boolean siswaMemuaskan = attendanceGood && (gradesHigh || behaviorGood);
        System.out.println("Siswa memuaskan kah ini? " + siswaMemuaskan);

        // - Buat ekspresi untuk "perlu perbaikan": !attendanceGood || !behaviorGood
        boolean siswaPerluPerbaikan = !attendanceGood || !behaviorGood;
        System.out.println("Siswa yang perlu perbaikan kah ini? " + siswaPerluPerbaikan);

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\\n=== APLIKASI PRAKTIS ===");

        // Latihan 5: Sistem kontrol akses
        // - Buat variabel untuk sistem keamanan
        // hasKeyCard = true, knowsPassword = false, isAuthorizedTime = true, isEmergency = false
        boolean hasKeyCard = true;
        boolean knowsPassword = false;
        boolean isAuthorizedTime = true;
        boolean isEmergency = false;

        // - Buat logika untuk akses normal: hasKeyCard && knowsPassword && isAuthorizedTime
        boolean aksesNormal = hasKeyCard && knowsPassword && isAuthorizedTime;
        System.out.println("Izinkan akses normal ga? " + aksesNormal);

        // - Buat logika untuk akses darurat: isEmergency || (hasKeyCard && isAuthorizedTime)
        boolean aksesDarurat = isEmergency || (hasKeyCard && isAuthorizedTime);
        System.out.println("Izinkan akses darurat ga? " + aksesDarurat);

        // - Buat logika untuk akses ditolak: !(akses normal OR akses darurat)
        boolean aksesDitolak = !(aksesNormal || aksesDarurat);
        System.out.println("Akses ditolak ga? " + aksesDitolak);

        // Latihan 6: Pengambilan keputusan berdasarkan cuaca
        // - Buat variabel kondisi cuaca
        // isRaining = false, isSnowing = true, temperature = -5, isCloudy = true
        isRaining = false;
        boolean isSnowing = true;
        int temperature = -5;
        boolean isCloudy = true;

        // - Tentukan apakah cuaca bagus untuk aktivitas outdoor
        // Cuaca bagus: tidak hujan AND tidak salju AND suhu > 0
        boolean cuacaBagus = !isRaining && !isSnowing && -5 > 0;
        System.out.println("Cuaca lagi bagus ga? " + cuacaBagus);

        // - Tentukan apakah Anda butuh payung: isRaining OR (isCloudy AND temperature > 20)
        boolean butuhPayung = isRaining || (isCloudy && -5 > 20);
        System.out.println("Butuh payung ga? " + butuhPayung);

        // - Tentukan apakah jalan mungkin berbahaya: isSnowing OR (isRaining AND temperature < 5)
        boolean jalanBerbahaya = isSnowing || (isRaining && -5 < 5);
        System.out.println("Jalan mungkin berbahaya ga? " + jalanBerbahaya);

        // ===== EVALUASI SHORT-CIRCUIT =====
        System.out.println("\\n=== EVALUASI SHORT-CIRCUIT ===");

        // Latihan 7: Demonstrasikan perilaku short-circuit dengan AND
        // - Buat variabel: a = 5, b = 0
        int a = 5;
        int b = 0;

        // - Buat ekspresi boolean: (b != 0) && (a / b > 2)
        // Ini TIDAK seharusnya menyebabkan division by zero karena evaluasi short-circuit
        boolean shortCircuit = (b != 0) && (a / b > 2);
        System.out.println("Hasil perilaku short-circuit: " + shortCircuit);

        // - Buat ekspresi lain: (b == 0) || (a / b > 2)
        // Ini juga TIDAK seharusnya menyebabkan division by zero karena evaluasi short-circuit
        boolean shortCircuit2 = (b == 0) || (a / b > 2);
        System.out.println("Hasil perilaku short-circuit ke 2: " + shortCircuit2);

        // - Jelaskan dalam komentar mengapa ekspresi ini aman
        /*
        ekspresi (b != 0) && (a / b > 2) aman, karena ada perilaku short-circuit AND(&&) dimana jika kondisi pertama
        false, kondisi kedua tidak dicek. false && true/false = false.
        (b != 0) false karena b = 0, maka (a / b > 2) tidak dicek.

        ekspresi (b == 0) || (a / b > 2) aman, karena ada perilaku short-circuit OR(||) dimana jika kondisi pertama
        true, kondisi kedua tidak dicek. true || false/true = true.
        (b == 0) true, maka (a / b > 2) tidak dicek.
         */

        // Latihan 8: Short-circuit dengan pemanggilan method (simulasi)
        // - Buat variabel untuk simulasi operasi mahal
        // expensiveCheck1 = false, expensiveCheck2 = true
        boolean expensiveCheck1 = false;
        boolean expensiveCheck2 = true;

        // - Simulasikan AND short-circuit: expensiveCheck1 && expensiveCheck2
        boolean andShortCircuit = expensiveCheck1 && expensiveCheck2;
        boolean andShortCircuit2 = expensiveCheckSatu() && expensiveCheckDua();
        System.out.println("expensiveCheck1 && expensiveCheck2: " + andShortCircuit);
        System.out.println("expensiveCheckSatu() && expensiveCheckDua(): " + andShortCircuit2);
        // Tambahkan komentar tentang "method" mana yang akan dipanggil
        /*
        Hanya expensiveCheckSatu() yang akan dipanggil dan dicek. expensiveCheckDua() tidak dicek karena
        expensiveCheckSatu() sudah false.
         */

        // - Simulasikan OR short-circuit: expensiveCheck2 || expensiveCheck1
        boolean orShortCircuit = expensiveCheck2 || expensiveCheck1;
        boolean orShortCircuit2 = expensiveCheckDua() || expensiveCheckSatu();
        System.out.println("expensiveCheck2 || expensiveCheck1: " + orShortCircuit);
        System.out.println("expensiveCheckDua() || expensiveCheckSatu(): " + orShortCircuit2);
        // Tambahkan komentar tentang "method" mana yang akan dipanggil
        /*
        Hanya expensiveCheckDua() yang akan dipanggil dan dicek. expensiveCheckSatu() tidak dicek karena
        expensiveCheckDua() sudah true.
         */
    }
}

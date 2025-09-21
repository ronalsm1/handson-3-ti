public class OperatorPrecedencePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operator Precedence
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk memahami
         * operator precedence, associativity, dan cara mengontrol urutan evaluasi.
         */

        // ===== PRECEDENCE OPERATOR ARITMATIKA =====
        System.out.println("=== PRECEDENCE OPERATOR ARITMATIKA ===");

        // Latihan 1: Precedence aritmatika dasar
        // - Buat variabel: a = 10, b = 5, c = 2
        int a = 10;
        int b = 5;
        int c = 2;

        // - Hitung hasil dari: a + b * c
        int hasil1 = a + b * c;
        // - Prediksi hasilnya terlebih dahulu, lalu hitung dan print
        System.out.println("Hasil dari 10 + 5 * 2 adalah: " + hasil1);
        // - Tambahkan komentar dengan prediksi vs hasil aktual
        /*
        Prediksi ku b * c dikerjakan dulu (5 * 2 = 10), lalu a + 10 atau 10 + 10 = 20.
        Hasil aktualnya adalah 20.
         */

        // - Hitung hasil dari: (a + b) * c
        int hasil2 = (a + b) * c;
        System.out.println("Hasil dari (10 + 5) * 2 adalah: " + hasil2);
        // - Bandingkan dengan hasil sebelumnya
        /*
        tanda kurung membuat ekspresi di dalamnya harus dihitung lebih dulu
        (a + b) -> (10 + 5) = 15
        15 * c -> 15 * 2 = 30
        Hasil aktualnya adalah 30
         */

        // - Hitung hasil dari: a * b + c / 2
        int hasil3 = a * b + c / 2;
        System.out.println("Hasil dari 10 * 5 + 2 / 2 adalah: " + hasil3);
        // - Jelaskan urutan operasi dalam komentar
        /*
        pertama, kerjakan a * b -> 10 * 5 = 50      kerjakan yang pembagian dulu bisa, baru perkalian. atau sebaliknya.
        kedua, kerjakan c / 2 -> 2/2 = 1            baru tambahkan hasil perkalian dengan hasil pembagian tersebut.
        ketiga, hitung 50 + 1 = 51
         */

        // - Hitung hasil dari: a / b + c * 2
        int hasil4 = a / b + c * 2;
        System.out.println("Hasil dari 10 / 5 + 2 * 2 adalah: " + hasil4);
        // - Tunjukkan evaluasi step-by-step dalam komentar
        /*
        pertama, kerjakan a / b -> 10 / 5 = 2
        kedua, kerjakan c * 2 -> 2 * 2 = 4
        ketiga, hitung 2 + 4 = 6
         */

        // ===== PRECEDENCE PERBANDINGAN DAN ARITMATIKA =====
        System.out.println("\\n=== PRECEDENCE PERBANDINGAN DAN ARITMATIKA ===");

        // Latihan 2: Mencampur operator aritmatika dan perbandingan
        // - Buat variabel: x = 15, y = 10, z = 20
        int x = 15;
        int y = 10;
        int z = 20;

        // - Evaluasi: x + y > z - 5
        boolean hasil5 = x + y > z - 5;
        System.out.println("Benar ga kalau 15 + 10 > 20 - 5? " + hasil5);
        // - Uraikan urutan evaluasi dalam komentar
        /*
        pertama, hitung x + y -> 15 + 10 = 25
        kedua, hitung z - 5 -> 20 - 5 = 15
        ketiga, bandingkan apakah 25 > 15 = true
         */

        // - Evaluasi: x > y + z / 4
        boolean hasil6 = x > y + z / 4;
        System.out.println("Benar ga kalau 15 > 10 + 20 / 4? " + hasil6);
        // - Jelaskan operasi mana yang terjadi lebih dulu
        /*
        operasi yang terjadi lebih dulu adalah pembagian
        urutan: (/) -> (+) -> (>)
        z / 4 -> 20 / 4 = 5
        y + 5 -> 10 + 5 = 15
        x > 15 -> 15 > 15 = false
         */

        // - Evaluasi: (x + y) > (z - 5) && x < z
        boolean hasil7 = (x + y) > (z - 5) && 15 < 20;
        System.out.println("(15 + 10) > (20 - 5) && 15 < 20: " + hasil7);
        // - Tunjukkan bagaimana tanda kurung mengubah evaluasi
        /*
        tanda kurung membuat ekspresi di dalamnya harus dihitung lebih dulu
        (x + y) -> (15 + 10) = 25
        (z - 5) -> (20 - 5) = 15
        25 > 15 = true
        15 < 20 = true
        true && true = true
         */

        // - Buat ekspresi kompleks: x * 2 + y > z && y < x + 5
        boolean hasil8 = x * 2 + y > z && y < x + 5;
        System.out.println("15 * 2 + 10 > 20 && 10 < 15 + 5: " + hasil8);
        // - Prediksi hasilnya, lalu verifikasi
        /*
        Prediksi ku hasilnya true, hasil aktualnya juga true.
         */

        // ===== PRECEDENCE OPERATOR LOGIKA =====
        System.out.println("\\n=== PRECEDENCE OPERATOR LOGIKA ===");

        // Latihan 3: Memahami precedence operator logika
        // - Buat variabel boolean: p = true, q = false, r = true
        boolean p = true;
        boolean q = false;
        boolean r = true;

        // - Evaluasi: p && q || r
        boolean hasil9 = p && q || r;
        System.out.println("true && false || true: " + hasil9);
        // - Jelaskan mengapa && memiliki precedence lebih tinggi dari ||
        /*
        operator && memiliki precedence lebih tinggi karena mirip dengan operator perkalian, dimana operasi perkalian
        dilakukan dulu sebelum penjumlahan. operator penjumlahan ini mirip dengan operator ||.
         */

        // - Evaluasi: p || q && r
        boolean hasil10 = p || q && r;
        System.out.println("true || false && true: " + hasil10);
        // - Bandingkan dengan hasil sebelumnya
        /*
        Hasil sebelumnya itu true.
        Hasil aktual yg ini juga true.
         */

        // - Evaluasi: !p && q || r
        boolean hasil11 = !p && q || r;
        System.out.println("!true && false || true: " + hasil11);
        // - Tunjukkan bagaimana NOT (!) memiliki precedence tertinggi
        /*
        NOT (!) akan dievaluasi lebih dulu
        !p -> !true = false
        false && q -> false && false = false
        false || r -> false || true = true
         */

        // - Gunakan tanda kurung untuk mengubah evaluasi: p && (q || r)
        boolean hasil12 = p && (q || r);
        System.out.println("true && (false || true): " + hasil12);
        // - Bandingkan dengan p && q || r
        /*
        inget kalau tanda kurung membuat ekspresi di dalamnya harus dievaluasi lebih dulu
        p && q || r -> q || r tidak berada dalam kurung, maka tetap yang dikerjakan lebih dulu adalah p && q (= false)
                       false || true hasilnya true.
        p && (q || r) -> q || r berada dalam kurung, maka yang dikerjakan lebih dulu adalah q || r (= true)
                         true && true hasilnya true.
         */

        // ===== TIPE OPERATOR CAMPURAN =====
        System.out.println("\\n=== TIPE OPERATOR CAMPURAN ===");

        // Latihan 4: Menggabungkan operator aritmatika, perbandingan, dan logika
        // - Buat variabel: num1 = 25, num2 = 15, num3 = 30
        int num1 = 25;
        int num2 = 15;
        int num3 = 30;

        // - Evaluasi: num1 > num2 + 5 && num3 / 2 < num1
        boolean hasil13 = num1 > num2 + 5 && num3 / 2 < num1;
        System.out.println("25 > 15 + 5 && 30 / 2 < 25: " + hasil13);
        // - Uraikan urutan evaluasi lengkap
        /*
        urutan evaluasi: /, +, >, <, &&
        num3 / 2 -> 30/2 = 15
        num2 + 5 -> 15+5 = 20
        num1 > 20 -> 25>20 = true
        15 < num1 -> 15<25 = true
        true && true = true
         */

        // - Evaluasi: num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10
        boolean hasil14 = num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10;
        System.out.println("25 + 15 > 30 || 30 - 25 < 10 && 15 > 10: " + hasil14);
        // - Tunjukkan evaluasi step-by-step
        /*
        num1 + num2 -> 25+15 = 40
        num3 - num1 -> 30-25 = 5
        40 > 30 = true
        5 < 10 = true
        num2 > 10 -> 15 > 10 = true
        true || true && true -> true && true = true
                                true || true = true
         */

        // - Gunakan tanda kurung untuk memaksa evaluasi berbeda: (num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10
        boolean hasil15 = (num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10;
        System.out.println("(25 + 15 > 30 || 30 - 25 < 10) && 15 > 10: " + hasil15);
        // - Bandingkan hasil dan jelaskan perbedaannya
        /*
        Hasil sebelumnya itu true
        Hasil aktual yg ini juga true. Yang berbeda adalah urutan evaluasinya
        Tanpa adanya kurung, && tetap memiliki precedence lebih tinggi dari ||
        urutan evaluasi yg sebelumnya: +, -, >, <, >, &&, ||
        karena ada kurung, urutan evaluasi yg ini jadi: +, -, >, <, >, ||, &&
         */

        // ===== UNARY OPERATORS DAN PRECEDENCE =====
        System.out.println("\\n=== UNARY OPERATORS DAN PRECEDENCE ===");

        // Latihan 5: Unary operators dengan operasi lain
        // - Buat variabel: value = 8
        int value = 8;

        // - Evaluasi: ++value * 2
        int hasil16 = ++value * 2;
        System.out.println("Hasil dari ++value * 2: " + hasil16);
        // - Jelaskan operasi mana yang terjadi lebih dulu
        /*
        Operasi yang terjadi lebih dulu adalah ++value, karena operator unary memiliki precedence lebih tinggi
        dari operasi perkalian.
         */

        // - Reset value ke 8, lalu evaluasi: value++ * 2
        value = 8;
        int hasil17 = value++ * 2;
        System.out.println("Hasil dari value++ * 2: " + hasil17);
        // - Bandingkan dengan hasil sebelumnya
        /*
        Yang sebelumnya, ++value merupakan pre-increment yang menambah nilai dulu menjadi 9, baru nilai 9 digunakan.
                         sehingga 9 * 2 hasilnya 18.
        Yang ini, value++ merupakan post-increment yang menggunakan nilai 8 dulu, baru nilai 8 ditambah menjadi 9.
                  nilai yang akan dikali 2 adalah 8, sehingga 8 * 2 hasilnya 16.
         */

        // - Reset value ke 8, lalu evaluasi: 2 * ++value
        value = 8;
        int hasil18 = 2 * ++value;
        System.out.println("Hasil dari 2 * ++value: " + hasil18);
        // - Amati urutan evaluasi
        /*
        urutan evaluasi: ++value -> *
        ++value = 9
        2 * 9 = 18
         */

        // - Reset value ke 8, lalu evaluasi: -value + 10
        value = 8;
        int hasil19 = -value + 10;
        System.out.println("Hasil dari -value + 10: " + hasil19);
        // - Tunjukkan bagaimana unary minus memiliki precedence tinggi
        /*
        -value -> -8
        -8 + 10 = 2
         */

        // ===== PRECEDENCE OPERATOR ASSIGNMENT =====
        System.out.println("\\n=== PRECEDENCE OPERATOR ASSIGNMENT ===");

        // Latihan 6: Operator assignment dan precedence
        // - Buat variabel: a = 5, b = 10
        a = 5;
        b = 10;

        // - Evaluasi dan jelaskan: a += b * 2
        a += b * 2;
        System.out.println("Hasil a += b * 2 adalah " + a);
        // - Tunjukkan bahwa aritmatika terjadi sebelum assignment
        /*
        assignment (=, +=, -=, *=, /=, %=) memiliki precedence lebih rendah dari aritmatika
        b * 2 -> 10 * 2 = 20
        a += 20 -> a = 5 + 20 = 25
         */

        // - Reset a ke 5, lalu evaluasi: a *= b + 3
        a = 5;
        a *= b + 3;
        System.out.println("Hasil a *= b + 3 adalah " + a);
        // - Jelaskan urutan evaluasi
        /*
        urutan evaluasi: + -> *=
        b + 3 -> 10 + 3 = 13
        a *= 13 -> a = 5 * 13 = 65
         */

        // - Evaluasi: a = b > 5 ? b * 2 : b / 2
        a = b > 5 ? b * 2 : b / 2;
        System.out.println("Hasil a = b > 5 ? b * 2 : b / 2 adalah " + a);
        // - Tunjukkan bagaimana ternary operator bekerja dengan assignment
        /*
        ternary operator (?) memiliki precedence lebih tinggi dari assignment
        jika b > 5 = true, maka a = b * 2 = 20
        jika b > 5 = false, maka a = b / 2 = 5
        b > 5 -> 10 > 5 = true
        a = true ? 20 : 5 -> maka a = 20
         */

        // ===== TANDA KURUNG DAN OVERRIDE PRECEDENCE =====
        System.out.println("\\n=== TANDA KURUNG DAN OVERRIDE PRECEDENCE ===");

        // Latihan 7: Menggunakan tanda kurung untuk mengontrol evaluasi
        // - Buat variabel: a = 8, b = 4, c = 2, d = 6
        a = 8;
        b = 4;
        c = 2;
        int d = 6;

        // - Bandingkan hasil dari: a + b * c - d dan (a + b) * (c - d)
        int hasil20 = a + b * c - d;
        System.out.println("Hasil dari 8 + 4 * 2 - 6 adalah " + hasil20);
        int hasil21 = (a + b) * (c - d);
        System.out.println("Hasil dari (8 + 4) * (2 - 6) adalah " + hasil21);
        // - Tunjukkan langkah kalkulasi untuk keduanya
        /*
        a + b * c - d -> b * c = 4 * 2 = 8
                         a + 8 = 8 + 8 = 16
                         16 - d = 16 - 6 = 10

        (a + b) * (c - d) -> a + b = 8 + 4 = 12
                             c - d = 2 - 6 = -4
                             12 * -4 = -48
         */

        // - Bandingkan hasil dari: a > b && c < d || a == b dan a > b && (c < d || a == b)
        boolean hasil22 = a > b && c < d || a == b;
        System.out.println("8 > 4 && 2 < 6 || 8 == 4: " + hasil22);
        boolean hasil23 = a > b && (c < d || a == b);
        System.out.println("8 > 4 && (2 < 6 || 8 == 4): " + hasil23);
        // - Jelaskan bagaimana tanda kurung mengubah logika
        /*
        inget kalau tanda kurung membuat ekspresi di dalamnya harus dievaluasi lebih dulu.
        Tanpa adanya tanda kurung, && dievaluasi lebih dulu karena memiliki precedence lebih tinggi dari ||
        Dengan adanya tanda kurung, walaupun && memiliki precedence lebih tinggi dari ||, || yang berada dalam kurung
                                    jadi dievaluasi lebih dulu
        8 > 4 = true
        2 < 6 = true
        8 == 4 -> false
        true || false = true
        true && true = true
         */
        // - Buat ekspresi nested kompleks menggunakan beberapa level tanda kurung
        // - Contoh: ((a + b) * c) / (d - 2) > (a - b)
        boolean nestedKompleks = ((a + b) * c) / (d - 2) > (a - b);
        System.out.println("Hasil ((a + b) * c) / (d - 2) > (a - b) adalah " + nestedKompleks);
        // - Tunjukkan evaluasi step-by-step
        /*
        urutan evaluasi: +, *, -, /, -, >
        a + b -> 8 + 4 = 12
        12 * c -> 12 * 2 = 24
        d - 2 -> 6 - 2 = 4
        24 / 4 = 6
        a - b -> 8 - 4 = 4
        6 > 4 = true
         */
    }
}

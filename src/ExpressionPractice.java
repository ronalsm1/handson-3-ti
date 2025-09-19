import java.lang.classfile.instruction.LineNumber;

public class ExpressionPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Expression, Statement & Block
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk memahami
         * perbedaan antara expressions, statements, dan blocks.
         */

        // ===== EXPRESSIONS =====
        System.out.println("=== EXPRESSIONS ===");

        // Latihan 1: Buat arithmetic expressions dan simpan hasilnya
        int a = 10;
        int b = 5;
        // - Buat expression yang menjumlahkan a dan b, simpan dalam variabel 'sum'
        int sum = a + b;

        // - Buat expression yang mengalikan a dan b, simpan dalam variabel 'product'
        int product = a * b;

        // - Buat boolean expression yang mengecek apakah a lebih besar dari b
        boolean lebihBesar = a > b;

        // - Buat string expression yang menggabungkan "Hello" dan "World"
        String haloDunia = "Hello" + "World";

        // - Buat method call expression menggunakan Math.pow(2, 3)
        double pangkat = Math.pow(2, 3);

        // - Print semua hasil expression dengan label yang deskriptif
        System.out.println("Hasil penjumlahan a dan b: " + a + " + " + b + " = " + sum);
        System.out.println("Hasil pengalian a dan b: " + a + " * " + b + " = " + product);
        System.out.println("a lebih besar dari b gak? " + lebihBesar);
        System.out.println("Hasil menggabungkan string: " + haloDunia);
        System.out.println("Hasil Math.pow(2, 3) atau 2^3: " + pangkat);

        // ===== STATEMENTS =====
        System.out.println("\\n=== STATEMENTS ===");

        // Latihan 2: Buat berbagai jenis statements
        // - Buat declaration statement untuk variabel integer 'score'
        int score;

        // - Buat assignment statement untuk memberikan nilai 85 ke score
        score = 85;

        // - Buat conditional statement yang mencetak "Pass" jika score >= 60, "Fail" jika sebaliknya
        if (score >= 60){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // - Buat loop statement yang mencetak angka 1 sampai 3
        for (int i = 1; i <= 3; i++){
            System.out.println("Angka: " + i);
        }

        // ===== BLOCKS =====
        System.out.println("\\n=== BLOCKS ===");

        // Latihan 3: Buat dan gunakan blocks
        int x = 15;

        // - Buat if block yang mengecek apakah x > 10
        // Di dalam block, deklarasikan variabel 'category' dan assign "High"
        // Print kedua nilai x dan category
        if (x > 10){
            String category = "High";
            System.out.println("Nilai x: " + x);
            System.out.println("Nilai " + x + " termasuk kategori " + category + ".");
        }

        // - Buat for loop block yang melakukan iterasi 3 kali
        // Di dalam block, deklarasikan variabel 'iteration' yang menunjukkan nomor loop saat ini
        // Print nomor iterasi
        for (int i = 1; i <= 3; i++){
            int iteration = i;
            System.out.println("Nomor iterasi: " + iteration);
        }

        // Latihan 4: Demonstrasikan variable scope dengan blocks
        int outerVariable = 100;

        {
            // - Di dalam block ini, deklarasikan variabel 'innerVariable' dengan nilai 50
            int innerVariable = 50;
            // - Print kedua outerVariable dan innerVariable
            System.out.println("outerVariable = " + outerVariable);
            System.out.println("innerVariable = " + innerVariable);
            // - Modifikasi outerVariable di dalam block ini (tambahkan 25)
            outerVariable += 25;
        }

        // - Print outerVariable setelah block (seharusnya menunjukkan nilai yang sudah dimodifikasi)
        System.out.println("outerVariable setelah block = " + outerVariable);
        // - Coba print innerVariable di sini - apa yang terjadi? (Comment baris ini setelah testing)
        //System.out.println("innerVariable setelah block = " + innerVariable);
    }
}

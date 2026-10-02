import java.util.Scanner;

public class RekapNilai {
    static final int SELESAI = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = 1, jumlahSah = 0;
        double total = 0, nilai;

        do { // do-while dipakai karena nilai pertama harus diminta dulu sebelum ada yang bisa dicek/dinilai
            System.out.print("Nilai ke-" + no + " : ");
            nilai = sc.nextInt();

            if (nilai == SELESAI) {
            } else if (nilai < 0 || nilai > 100) {
                System.out.println("Ditolak, harus 0-100");
            } else {
                // Urutan sengaja dibalik: >=60 ditaruh paling atas untuk percobaan
                char grade = nilai >= 60 ? 'D' : nilai >= 70 ? 'C' : nilai >= 80 ? 'B' : nilai >= 90 ? 'A' : 'E';
                // jika jalankan dengan input 85, yang terjadi adalah output nilai ke 1 dan 2 menjadi grade D
                String ket = switch (grade) {
                    case 'A' -> "Sangat Baik";
                    case 'B' -> "Baik";
                    case 'C' -> "Cukup";
                    case 'D' -> "Kurang";
                    default -> "Gagal";
                };

                System.out.println("Grade " + grade + " - " + ket);
                total += nilai;
                jumlahSah++;
                no++;
            }
        } while (nilai != SELESAI);

        double rata = jumlahSah == 0 ? 0 : total / jumlahSah;
        String status = rata >= 60 ? "LULUS" : "TIDAK LULUS";

        System.out.printf("%nNilai sah : %d%nRata-rata : %.2f%nStatus    : %s%n", jumlahSah, rata, status);
    }
}
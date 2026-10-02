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
                // tentukan grade dan keterangan
                total += nilai;
                jumlahSah++;
                no++;
            }
        } while (nilai != SELESAI);
    }
}
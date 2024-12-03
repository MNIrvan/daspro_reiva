import java.util.Scanner;

public class ArrayRataNilai27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlMhs]; 
        double total = 0, totalLulus = 0, totalTidakLulus = 0;
        int Lulus = 0, TidakLulus = 0; 

        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < jmlMhs; i++) {
            total += nilaiMhs[i]; 

            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                Lulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                TidakLulus++;
            }
        }
        double rataLulus = (Lulus > 0) ? totalLulus / Lulus : 0;
        double rataTidakLulus = (TidakLulus > 0) ? totalTidakLulus / TidakLulus : 0;

        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);

    }
}

import java.util.*;

public class Pemilihan2Perobaan1_25 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
    
        int tahun;
    
        System.out.print("Masukkan tahun : ");
        tahun = user.nextInt();
    
        if (tahun % 4 == 0) {
          System.out.println("Tahun " +tahun+ " adalah Tahun Kabisat");

            if (tahun % 100 == 0) {
                // System.out.println("Tahun " +tahun+ "Bukan Tahun Kabisat");

            } else if (tahun % 400 == 0)  {
            //   System.out.println("Tahun " +tahun+ " adalah Tahun Kabisat");
            }
        } else {
            System.out.println("Tahun" +tahun+ " Bukan tahun kabisat");
        }
    }

}


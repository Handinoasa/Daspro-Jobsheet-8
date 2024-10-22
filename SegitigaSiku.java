import java.util.Scanner;

public class SegitigaSiku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan tinggi segitiga N = ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            // Mencetak asterisk sebanyak i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Pindah ke baris berikutnya
            System.out.println();
        }

        sc.close(); // Menutup scanner untuk mencegah kebocoran sumber daya
    }
}
  
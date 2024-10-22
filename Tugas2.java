import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaAtlet;

        while (true) {
            System.out.println("========================================================");
            System.out.println("Selamat datang di porseni Politeknik Negeri Malang 2024!");
            System.out.println("========================================================");

            System.out.print("Masukkan nama politeknik (Ketik 'exit' untuk selesai) = ");
            String namaPoli = sc.nextLine();

            if(namaPoli.equalsIgnoreCase("exit")) {
                System.out.println("Terima kasih telah menggunakan program ini!");
                break;
            }

            System.out.println("Nama atlet " + namaPoli + " cabor badminton");
            for (int i = 1; i <= 5; i++) {
                System.out.print("Nama atlet ke-" + i + "= ");
                namaAtlet = sc.nextLine();
            }
            System.out.println();

            System.out.println("Nama atlet " + namaPoli + " cabor tenis meja");
            for (int i = 1; i <= 5; i++) {
                System.out.print("Nama atlet ke-" + i + "= ");
                namaAtlet = sc.nextLine();
            }
            System.out.println();

            System.out.println("Nama atlet " + namaPoli + " cabor basket");
            for (int i = 1; i <= 5; i++) {
                System.out.print("Nama atlet ke-" + i + "= ");
                namaAtlet = sc.nextLine();
            }
            System.out.println();

            System.out.println("Nama atlet " + namaPoli + " cabor bola voly");
            for (int i = 1; i <= 5; i++) {
                System.out.print("Nama atlet ke-" + i + "= ");
                namaAtlet = sc.nextLine();
            }
            System.out.println();
        }
    }
}

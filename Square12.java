import java.util.Scanner;
/**
 * Square100
 */
public class Square12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai N = ");
        int N = sc.nextInt();
        for (int iOuter = 1; iOuter <= N; iOuter++) {
            for (int iInner = 1; iInner <= N; iInner++) {
                System.out.print("*"); 
            }
            System.out.println(); 
        }
        sc.close(); 
    }
}
    
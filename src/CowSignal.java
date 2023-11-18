import java.util.Scanner;
public class CowSignal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            String a = sc.nextLine();
            char[] c = a.toCharArray();
            char[] d = new char[n * k];
            for (int j = 0; j < d.length; j++) {
                d[j] = c[j / k];
            }
            for (int p = 0; p < k; p++) {
                for (int l = 0; l < d.length; l++) {
                    System.out.print(d[l]);
                }
                System.out.println();
            }
        }
    }
}
import java.util.Scanner;
public class Shuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            int[] tc = new int[n];
            for (int j = 0; j < n; j++) {
                tc[j] = c[s[j]-1];
            }
            for (int j = 0; j < n; j++) {
                c[j] = tc[j];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(c[i]);
        }
    }
}

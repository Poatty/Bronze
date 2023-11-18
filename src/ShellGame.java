import java.util.Scanner;
public class ShellGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = new int[n];
        int[] l = new int[n];
        int[] g = new int[n];
        for (int i = 0; i < n; i++) {
            f[i] = sc.nextInt() - 1;
            l[i] = sc.nextInt() - 1;
            g[i] = sc.nextInt() - 1;
        }
        int max = 0;
        for (int i = 0; i < 2; i++) {
            int c = 0;
            int[] s = {0, 0, 0};
            s[i] = 1;
            for (int j = 0; j < n; j++) {
                if (s[f[j]] == 1) {
                    s[f[j]] = 0;
                    s[l[j]] = 1;
                } else if (s[l[j]] == 1){
                    s[l[j]] = 0;
                    s[f[j]] = 1;
                }
                if (s[g[j]] == 1) {
                    c++;
                }
            }
            if (c > max) {
                max = c;
            }
        }
        System.out.println(max);
    }
}
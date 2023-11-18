import java.util.Scanner;
public class MixingMilk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] c = new int[3];
        int[] m = new int[3];
        for (int i = 0; i < 3; i++) {
            c[i] = sc.nextInt();
            m[i] = sc.nextInt();
        }
        int f = 0;
        int n = 1;
        for (int i = 0; i < 100; i++) {
            if (m[f] + m[n] <= c[n]) {
                m[n] = m[f] + m[n];
                m[f] = 0;
            } else {
                m[f] = m[f] - (c[n] - m[n]);
                m[n] = c[n];
            }
            f++;
            n++;
            if (n==3) {
                n=0;
                continue;
            }
            if (f==3) {
                f = 0;
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(m[i]);
        }
    }
}
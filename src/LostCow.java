import java.util.Scanner;
public class LostCow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int pos = x;
        int i = 1;
        int d = 0;
        while (y > x && pos < y || y<x && pos > y){
            d = d + Math.abs(pos - (x + i));
            pos = x + i;
            i = i * -2;
        }
        d = d - Math.abs(pos - y);
        System.out.println(d);
    }
}
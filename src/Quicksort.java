public class Quicksort {
    public static void main(String[] args) {
        int[] inte = {8, 4, 95, 24, 1356, 6, 3, 93};
        for (int i = 1; i < 8; i++) {
            int j = 0;
            while (j < i){
                if (inte[j] > inte[i]) {
                    int x = inte[i];
                    for (int k = i - 1; k >= j; k--) {
                        inte[k + 1] = inte[k];
                    }
                    inte[j] = x;
                    break;
                }
                j++;
            }
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(inte[i]);
        }
    }
}

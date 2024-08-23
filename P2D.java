public class P2D {
    public static void main(String[] args) {
        int n = 6;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < (n - i) * 2; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}

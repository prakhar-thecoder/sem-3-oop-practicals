public class P3B {
    public static void main(String[] args) {
        int a[] = new int[]{4, 2, -3, 1, 6};
        int sum;
        boolean exists = false;
        
        for (int i = 0; i < a.length; i++) {
            sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                
                if (sum == 0) {
                    exists = true;
                    break;
                }
            }
            
            if (exists) {
                break;
            }
        }
        
        if (exists) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

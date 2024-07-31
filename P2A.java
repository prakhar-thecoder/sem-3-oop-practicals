public class P2A {
    public static void main(String[] args) {
        int n = 59;
        int num = n;
        int sum = 0;
        int mul = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            mul *= digit;
            n /= 10;
        }

        if (sum + mul == n) {
            System.out.println(num + " is a special number!");
        } else {
            System.out.println(num + " is not a special number!");
        }
    }
}

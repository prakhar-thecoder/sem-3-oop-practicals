public class P2Civ {
    public static void main(String[] args) {
        int num = 121;
        int n = num;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev *= 10;
            rev += digit;
            n /= 10;
        }

        System.out.println("The reverse of " + num + ": " + rev);

        if (num == rev) {
            System.out.println(num + " is palindrome");
        } else {
            System.out.println(num + " is not palindrome");
        }
    }
}

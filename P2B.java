public class P2B {
    public static void main(String[] args) {
        int a = 14;
        float b = 14.1f;
        float c = a;
        int d = (int) b;

        System.out.println("Automatic type casting int -> float: " + c);
        System.out.println("Explicit type casting float -> int: " + d);
    }
}

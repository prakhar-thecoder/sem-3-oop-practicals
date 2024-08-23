import java.util.Scanner;

public class P3A {
    public static void main(String[] args) {
        int a, b, ans;
        char op;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter operator: ");
        op = sc.next().charAt(0);
        System.out.print("Enter b: ");
        b = sc.nextInt();

        sc.close();
        
        switch (op) {
            case '+':
                ans = a + b;
                break;
            case '-':
                ans = a - b;
                break;
            case '*':
                ans = a * b;
                break;
            case '/':
                ans = a / b;
                break;
            case '&':
                ans = a & b;
                break;
            case '|':
                ans = a | b;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        
        System.out.println(a + " " + op + " " + b + " = " + ans);
    }
}

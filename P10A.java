import java.util.Scanner;

class OddThread extends Thread {
    private int n;

    public OddThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 1; i <= n; i += 2) {
            synchronized (System.out) {
                System.out.println("OddThread: " + i);
            }
        }
    }
}

class EvenThread extends Thread {
    private int n;

    public EvenThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 2; i <= n; i += 2) {
            synchronized (System.out) {
                System.out.println("EvenThread: " + i);
            }
        }
    }
}

public class P10A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        OddThread oddThread = new OddThread(n);
        EvenThread evenThread = new EvenThread(n);

        oddThread.start();
        evenThread.start();
    }
}

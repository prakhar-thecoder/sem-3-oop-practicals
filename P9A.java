class InvalidNumber extends Exception {
    public InvalidNumber(String message) {
        super(message);
    }
}

class MathFunctions {
    public float getMean(int[] numbers) throws InvalidNumber {
        int sum = 0;
        for (int num : numbers) {
            if (num < 0 || num > 100) {
                throw new InvalidNumber("Number out of range: " + num);
            }
            sum += num;
        }
        return (float) sum / numbers.length;
    }

    public float divideNum(int number1, int number2) {
        return (float) number1 / number2;
    }
}

public class P9A {
    public static void main(String[] args) {
        MathFunctions mathFunctions = new MathFunctions();
        
        int[] numbers = {90, 80, 70, 101};
        int number1 = 10, number2 = 2;

        try {
            System.out.println("Mean: " + mathFunctions.getMean(numbers));
            System.out.println("Division Result: " + mathFunctions.divideNum(number1, number2));
        } catch (InvalidNumber | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

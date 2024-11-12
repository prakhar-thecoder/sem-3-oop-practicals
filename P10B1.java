import java.io.*;
import java.util.Scanner;

class BlankFieldException extends Exception {
    public BlankFieldException(String message) {
        super(message);
    }
}

class User {
    private int rollNumber;
    private String name;
    private int age;
    private String address;

    public User(int rollNumber, String name, int age, String address) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return rollNumber + "," + name + "," + age + "," + address;
    }
}

public class P10B1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Roll Number: ");
            int rollNumber = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            if (name.isBlank()) throw new BlankFieldException("Name cannot be blank");

            System.out.print("Enter Age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter Address: ");
            String address = scanner.nextLine();
            if (address.isBlank()) throw new BlankFieldException("Address cannot be blank");

            User user = new User(rollNumber, name, age, address);

            System.out.print("Do you want to save this record to a file? (yes/no): ");
            String choice = scanner.nextLine();
            
            if (choice.equalsIgnoreCase("yes")) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("records.txt", true))) {
                    writer.write(user.toString());
                    writer.newLine();
                    System.out.println("Record saved to file.");
                } catch (IOException e) {
                    System.out.println("Error writing to file: " + e.getMessage());
                }
            } else {
                System.out.println("Program terminated.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Age and Roll Number must be numeric.");
        } catch (BlankFieldException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}

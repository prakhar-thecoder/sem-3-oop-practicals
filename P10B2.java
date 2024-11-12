import java.io.*;

public class P10B2 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("records.txt"))) {
            String line;
            System.out.println("Records from file:");
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                System.out.println("Roll Number: " + fields[0] + ", Name: " + fields[1] + ", Age: " + fields[2] + ", Address: " + fields[3]);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}

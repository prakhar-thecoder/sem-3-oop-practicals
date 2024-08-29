import java.util.Scanner;

public class P5A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter paragraph: ");
        String para =  sc.nextLine();

        String[] sentences = para.split("\\. ");
        System.out.println("Total no. of sentences: " + sentences.length);
        for(String s: sentences) System.out.println(s);

        char[] chars = new char[para.length()];
        int counter = 0;
        System.out.println("Total no. of characters: " + para.length());
        for (int i = 0; i < para.length(); i++) {
            boolean found = false;
            for (int j = 0; j < chars.length; j++) if (chars[j] == para.charAt(i)) found = true;
            if (found) continue;
            
            int count = 0;
            for (int j = 0; j < para.length(); j++) if (para.charAt(i) == para.charAt(j)) count++;
            System.out.println(para.charAt(i) + " occurs " + count + " times");
            chars[counter] = para.charAt(i);
            counter++;
        }

        System.out.print("Enter word to search: ");
        String word = sc.nextLine();
        boolean found = true;
        int index = -1;
        for (int i = 0; i < para.length(); i++) {
            if (para.charAt(i) == word.charAt(0)) {
                index = i;
                for (int j = 0; j < word.length(); j++) {
                    if (para.charAt(i + j) != word.charAt(j)) {
                        found = false;
                        break;
                    }
                }
                if (found) break;
            }
        }
        if (found) System.out.println(word + " found at index: " + index);
        else System.out.println(word + " not found");

        sc.close();
    }
}

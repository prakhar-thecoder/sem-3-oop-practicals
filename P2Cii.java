public class P2Cii {
    public static void main(String[] args) {
        char c = 'a';
        
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println(c + " is a vowel");
        } else if (c == '_' || c == '.' || c == '-') {
            System.out.println(c + " is a special character");
        } else {
            System.out.println(c + " is a consonent");
        }
    }
}
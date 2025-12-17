import java.util.Hashtable;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the 2 strings:");
        String s1 = obj.nextLine().toLowerCase();
        String s2 = obj.nextLine().toLowerCase();

        if(s1.length() != s2.length()) {
            System.out.println("Not an Anagram");
        }
        Hashtable<Character, Integer> a = new Hashtable<>();

        for (char ch : s1.toCharArray()) {
            a.put(ch, a.getOrDefault(ch, 0) + 1);
        }

        boolean isAnagram = true;
        for (char ch : s2.toCharArray()) {
            if (!a.containsKey(ch) || a.get(ch) == 0) {
                isAnagram = false;
                break;
            }
            a.put(ch, a.get(ch) - 1);
        }

        if (isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an Anagram");
        }
    }
}

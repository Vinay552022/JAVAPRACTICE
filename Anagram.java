
import java.util.*;
import java.lang.*;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a.toUpperCase();
        b.toUpperCase();
        HashMap<Character, Integer> hp1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hp2 = new HashMap<Character, Integer>();
        int x;
        for (int i = 0; i < a.length(); i++) {
            if (hp1.containsKey(a.charAt(i))) {
                x = hp1.get(a.charAt(i));
                x++;
                hp1.put(a.charAt(i), x);
            } else {
                hp1.put(a.charAt(i), 1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (hp2.containsKey(b.charAt(i))) {
                x = hp2.get(b.charAt(i));
                x++;
                hp2.put(b.charAt(i), x);
            } else {
                hp2.put(b.charAt(i), 1);
            }
        }
        if (hp1.equals(hp2)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
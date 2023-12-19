

import java.util.*;

public class countVowelConstentInString {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String ch = s.nextLine();
        ch = ch.toUpperCase();
        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < ch.length(); i++) {
            char c = ch.charAt(i);
            if (c != ' ') {
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);
    }
}




// Write a Java program to check if a vowel is present in a string.

public class check_vowel {
    public static void main(String args[]) {
        String input = "hreverse a string in java";
        boolean containsVowels = input.toLowerCase().matches(".*[aeiou].*");
        System.out.println(containsVowels);
    }
}
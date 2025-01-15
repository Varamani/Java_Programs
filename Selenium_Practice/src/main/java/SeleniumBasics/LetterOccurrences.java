package Programs;

import java.util.HashMap;

/*public class LetterOccurrence {
    public static void main(String[] args) {
        String inputString = "Hello, world!"; // The string to search
        char letterToFind = 'o';             // The letter to count
        int count = 0;

        // Convert the string to lowercase to make the search case-insensitive (optional)
        inputString = inputString.toLowerCase();
        letterToFind = Character.toLowerCase(letterToFind);

        // Loop through the string and count occurrences of the letter
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == letterToFind) {
                count++;
            }
        }

        // Print the result
        System.out.println("The letter '" + letterToFind + "' occurs " + count + " times in the string.");
    }
}*/

public class LetterOccurrences {
    public static void main(String[] args) {
        String inputString = "Karimulla Shaik"; // Input string
        inputString = inputString.toLowerCase(); // Convert to lowercase to make it case-insensitive
        
        // Use a HashMap to store letter frequencies
        HashMap<Character, Integer> letterCount = new HashMap<>();

        // Loop through the string and count occurrences of each letter
        for (char c : inputString.toCharArray()) {
            if (Character.isLetter(c)) { // Consider only alphabetic characters
                letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
            }
        }

        // Print the letter frequencies
        System.out.println("Occurrences of each letter:");
        for (char key : letterCount.keySet()) {
            System.out.println(key + ": " + letterCount.get(key));
        }
    }
}

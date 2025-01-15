package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacters {
	
	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find duplicate characters
        // Create a HashMap to store character frequencies
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Loop through each character in the string
        for (char c : input.toCharArray()) {
            
        	charCountMap.put(c, charCountMap.getOrDefault(c, 0)+1);
        }

 
        System.out.println("Duplicate characters in the string are:");
        // Print characters with a count greater than 1
        
        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet())
        {
        	System.out.println(entry.getKey()+" "+entry.getValue());
        }

        scanner.close();

	}
}

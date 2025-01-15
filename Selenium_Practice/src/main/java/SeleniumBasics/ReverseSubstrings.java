package Programs;

public class ReverseSubstrings {
	public static void main(String[] args) {
        String input = "abc xyz def uvw";
        String reverseString = "";
      /*  // Split the input string by spaces to get the substrings
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        
        // Loop through each word and reverse it
        for (String word : words) {
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }

        // Trim the trailing space and print the result
        System.out.println(result.toString().trim());*/
        
        String words[]=input.split(" ");
        
        for(int i=0;i<words.length;i++)
        {
        	String word=words[i];
        	String nstr = ""; 
        	char ch; 
        	for (int j = 0; j < word.length(); j++) 
        	{ 
        	ch = word.charAt(j);
        	nstr = ch + nstr;
        	}
        	reverseString = reverseString + nstr + " ";
        }
        System.out.println(reverseString);
    }
}
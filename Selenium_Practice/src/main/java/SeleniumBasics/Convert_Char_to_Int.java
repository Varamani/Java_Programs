package Programs;

public class Convert_Char_to_Int {
	
	public static void main(String[] args)
    {
        // Declaring and initializing a character
        char ch = '3';
 
        // Displaying above character on console
        System.out.println("char value: " + ch);
 
        // Converting the Character to it's int value
        // using getNumericValue() method of Character Class
        int a = Character.getNumericValue(ch);
 
        // Printing the corresponding integral value
        System.out.println("int value: " + a);
    }

}

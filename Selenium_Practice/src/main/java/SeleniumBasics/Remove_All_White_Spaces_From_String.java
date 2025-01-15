package Programs;

public class Remove_All_White_Spaces_From_String {

	    public static void main(String[] args)
	    {
	        String s = "    Geeks     for Geeks     ";
	        String a = "";

	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);

	            // Checking whether is white space or not
	            if (!Character.isWhitespace(c)) {
	                a =a+c;
	            }
	        }
	        System.out.println(a);
	    }
}

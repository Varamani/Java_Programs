package Programs;

public class Separate_Upper_Lower_Chars_From_String {


	    public static void main(String[] args)
	    {
	        String s = "SadiQ KAreeM";
	        String u = "";
	        String l = "";

	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            
	            if (Character.isLowerCase(c)) {
	                u =u+c;
	            }
	            else if (Character.isUpperCase(c)) {
	                l =l+c;
	            }
	        }
	        System.out.println(u);
	        System.out.println(l);
	       
	    }
}



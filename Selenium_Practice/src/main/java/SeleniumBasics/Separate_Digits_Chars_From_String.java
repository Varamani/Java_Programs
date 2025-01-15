package Programs;

public class Separate_Digits_Chars_From_String {


	    public static void main(String[] args)
	    {
	        String s = "Sadiq123@@";
	        String a = "";
	        String d= "";
	        String sc="";

	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            
	            if (Character.isAlphabetic(c)) {
	                a =a+c;
	            }
	            else if (Character.isDigit(c)) {
	                d =d+c;
	            }
	            else{
	                sc =sc+c;
	            }
	        }
	        System.out.println(a);
	        System.out.println(d);
	        System.out.println(sc);
	    }
}


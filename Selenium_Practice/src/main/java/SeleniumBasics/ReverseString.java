package Programs;

public class ReverseString {
	
	 public static void main(String[] args) {
	        String s = "Sadiq";
	        String revStng="";

	       for(int i=0;i<s.length();i++)
	       {
	    	   revStng=s.charAt(i)+revStng;
	       }

	        // Trim the trailing space and print the result
	        System.out.println(revStng);
	    }

}

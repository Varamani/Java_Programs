package Programs;

public class Convert_dataTypes_In_String {

	 public static void main(String[] args) {
	      
	        int i=10;
	        short s=19;
	        byte b=10;
	        long l=10;
	        double d=10.90;
	        float f=10f;
	        char c='2';
	        
	      //Convert byte to String 
	        String b1 = Byte.toString(b);
	        String b2 = String.valueOf(b);
	        
	        //Convert short to String 
	        String s1=Short.toString(s);
	        String s2=String.valueOf(s);

	        //Convert int to String  
	        String i1 = Integer.toString(i);
	        String i2 = String.valueOf(i);
	        
	        //Convert double to String 
	        String d1=Double.toString(d);
	        String d2=String.valueOf(d);
	        
	        // Convert long to String 
	        String l1 = Long.toString(l);
	        String l2 = String.valueOf(l);
	        
	        //Convert float to String
	        String f1=Float.toString(f);
	        String f2=String.valueOf(f);
	        
	        //Convert char to String
	        String c1=Character.toString(c);
	        String c2=String.valueOf(c);

	        
	    }
}

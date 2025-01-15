package Programs;

public class Convert_String_Into_Different_DataTypes {
	

	  
	    public static void main(String[] args) {
	      
	        String str = "123";
	        
	      //Convert string to Byte 
	        byte b = Byte.parseByte(str);
	        byte b1 = Byte.valueOf(str);
	        
	        //Convert string to double
	        short s=Short.parseShort(str);
	        short s1=Short.valueOf(str);

	        //Convert string to int 
	        int i = Integer.parseInt(str);
	        int i1 = Integer.valueOf(str);
	        
	        //Convert string to double
	        double d=Double.parseDouble(str);
	        double d1=Double.valueOf(str);
	        
	        // Convert string to long 
	        long l = Long.parseLong(str);
	        long l1 = Long.valueOf(str);
	        
	        //Convert string to float
	        float f=Float.parseFloat(str);
	        float f1=Float.valueOf(str);

	        System.out.println("The integer value is: " + b);
	        System.out.println("The integer value is: " + b1);
	        System.out.println("The integer value is: " + s);
	        System.out.println("The integer value is: " + s1);
	        System.out.println("The integer value is: " + i);
	        System.out.println("The integer value is: " + i1);
	        System.out.println("The integer value is: " + d);
	        System.out.println("The integer value is: " + d1);
	        System.out.println("The integer value is: " + l);
	        System.out.println("The integer value is: " + l1);
	        System.out.println("The integer value is: " + f);
	        System.out.println("The integer value is: " + f1);
	    }
	}



package Programs;

public class Calculate_Sum_Of_All_Numbers_In_String {
	
	public static void main(String[] args)
	{
		int sum=0;
		String s = "jklmn489pjro635ops";
		for(int i=0; i<s.length(); i++) {
		    char temp = s.charAt(i);
		    if (Character.isDigit(temp)) {
		        int b = Integer.parseInt(String.valueOf(temp));
		        sum=sum+b;
		    }
		}
		System.out.println(sum);
	}

}

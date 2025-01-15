package Programs;

public class Factorial_Number {
	
	public static void main(String[] args)
	{
		int fact=1;
		int number=3;
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		
		System.out.println(fact);
	}

}

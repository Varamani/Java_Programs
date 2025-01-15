package Programs;

import java.util.Scanner;

public class Number_of_Digits {

	public static void main(String[] args) {
		int no = 0, a = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number : ");
		no = scanner.nextInt();
		
		String s=Integer.toString(no);
		
		for(int i=0;i<=s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				a++;
			}
		}
				
		/*while (no > 0) {
			no = no / 10;
			a++;
		}*/
		System.out.println("Number of digits in given number is :" + a);
	}

	
}

package Programs;

public class FibonacciExample {

	public static void main(String args[]) {
		int n1 = 0;
		int n2 = 1;
		int n3;
		int i;
		int count = 10;
		
		//System.out.print(n1 + " " + n2);// printing 0 and 1

		for (i = 0; i < count; i++)// loop starts from 2 because 0 and 1 are already printed
		{
			System.out.print(n1 + " ");
			n3=n1+n2;
			n1 = n2;
			n2 = n3;
		}

	}

}

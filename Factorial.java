package for_loop;

public class Factorial {
	 
	void print()
	{
		int fact=1;
		for(int no=5; no>=1; no--)
		{
			fact=fact*no;
		}
		System.out.println("factorial = "+fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Factorial pattern=new Factorial();
		pattern.print();
	}

}

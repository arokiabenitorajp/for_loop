package for_loop;

public class Factorial_in_recursion {
	
	static int a;
	
	 public  int fact(int a)
	 {
		 if(a!=0)
		 {
			 a=a*fact(a-1);
			 System.out.println(a);
			 return a;
			 
		 }
		 else 
		 {
			 return 1;
		 }
	 
	 
	 }
		/*void print(int n)
		{
			if(n>0)
			{
			System.out.println(5-(n-1));
			print(n-1);
			}
		}*/

	
	

	
	public static void main(String[] args)
	{
		Factorial_in_recursion no=new Factorial_in_recursion();
		 int b = no.fact(5);
		// no.print(5);
//System.out.println(b);
		
		
		
	}

}

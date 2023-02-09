package for_loop;

public class Sum_of_even_number {
	
	void print()
	{
		int n=20;
			int add=0;
			for(int i=1; i<=n; i++)
			{
				if(i%2==0)
				{
					add=add+i;
					
				}
				
			}
				
			System.out.println(add);
	}
	
	public static void main(String[] args) 
	{
		Sum_of_even_number number=new Sum_of_even_number();
		number.print();
		
	}
	

}

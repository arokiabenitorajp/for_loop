package for_loop;

public class Without_9_multiples {
	
	void print()
	{
		int num=20;
		int i;
		 for(i=1; i<=num; i++)
		 {
			 if(i%9!=0)
			 {
				 System.out.println(i);
			 }
		 }
	}
	
	
	public static void main(String[] args) 
	{
		Without_9_multiples number=new Without_9_multiples();
		number.print();
		
	}

}

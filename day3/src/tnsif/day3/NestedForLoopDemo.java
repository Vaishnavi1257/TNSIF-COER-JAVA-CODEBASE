package tnsif.day3;

public class NestedForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//program to print the multiplcation tables 
		//int a givem range by using nested forloop
		
		int beg=5;
		int end=20;
		
		for(int i=beg; i<=end; i++)
		{
			for(int j=1; j<=10; j++)
			{
				System.out.println(i + "*" + j+ "="+ i*j);
	
			}
			
			System.out.println();
		}

	}

}

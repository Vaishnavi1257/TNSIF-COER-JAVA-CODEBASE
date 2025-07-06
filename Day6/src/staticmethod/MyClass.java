package staticmethod;

public class MyClass {

	private int section;
	
	private static int srNo;
	
	static
	{
		System.out.println("-----Within static Block-----");
		srNo=1000;
		
	}
	
	//default constructor
	
	public MyClass() {
		System.out.println("-----Within default block-----");
		srNo++;
		section++;

	}

	@Override
	public String toString() {
		return "MyClass [section=" + srNo + section + "]";
	}
	
	
	static void display()
	{
		System.out.println("Serial no:"+srNo);
	}
	
	
	
        
}

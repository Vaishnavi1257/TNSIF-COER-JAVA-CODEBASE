package FinalDemo;

public class FinalVaribles {
	
	//finl instance var must br initilize
	final int x=100;
	//final int a;
	
	//final a static balank final var
	final static int y;
	
	final static int z=10;
	
	//instatnce method
	void change()
	{
		//a=20;
		//x=30; fianl var can't be change
		//z=50; or re asign
	}

	@Override
	public String toString() {
		return "FinalVaribles [x=" + x + ",y=" + y + "]";
	}
	
	static {
		y=20;
		//z=80; once initialized can't be reassign
		System.out.println("value of Y : "+ y);
	}	

}

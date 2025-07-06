package FinalDemo;

public class FinalClass {

	 void show() {
	        System.out.println("Final class cannot be inherited");
	    }

	    public static void main(String[] args) {
	        FinalClass f = new FinalClass();
	        f.show();
	    }
	}
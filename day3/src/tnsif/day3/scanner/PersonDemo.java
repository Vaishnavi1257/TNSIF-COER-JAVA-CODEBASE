package tnsif.day3.scanner;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ob=new Scanner(System.in);
		
		String name;
		System.out.println("Enter Person name : ");
		name=ob.next();
		System.out.println("Enter age : ");
		int age =ob.nextInt();
		System.out.println("Enter Income : ");
		int income =ob.nextInt();
		
		System.out.println("Enter Gender : ");
		String gender =ob.next();
		System.out.println("Enter MobileNumber : ");
		long MobileNumber =ob.nextLong();
		
		
		Person person=new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		person.setMobileNumber(MobileNumber);
		
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getIncome());
		System.out.println(person.getMobileNumber());
		System.out.println(person.getGender());
		
		
		
	}

}

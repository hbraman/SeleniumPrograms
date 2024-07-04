package interview;

public class Swap {
	private static void swap() { //with 3rd variable
		int mysalary = 2000;
		int leadsalary= 5000;
		System.out.println("Before swaping "+ "my:"+mysalary+ "lead:"+leadsalary );
		int temp=mysalary;
		mysalary=leadsalary;
		leadsalary=temp;
		System.err.println("After swaping "+ "my:"+mysalary+ "lead:"+leadsalary );

	}
	
	private static void swap2() { // without 3rd variable addition
		//first = first-second : second= first+second : first=second-first
		
		
		int first = 20;
		int second =40;
		System.out.println("Before swaping " + "first:"+first+"Second:"+second);
		first=first-second;
		second=first+second;
		first=second-first;
		System.err.println("Before swaping " + "first:"+first+"Second:"+second);
	}
	private static void swap3() {
		//first = first*second ; second= first/second ; first= first/second
	int a= 50;
	int b=70;
	System.out.println("Before Swaping "+"a :"+a+"b :"+b);
	a=a*b;
	b=a/b;
	a=a/b;
	System.out.println("Before Swaping "+"a :"+a+"b :"+b);
	
	} 
	
	public static void main(String[] args) {
		swap();
		swap2();
		swap3();
		
	}

}

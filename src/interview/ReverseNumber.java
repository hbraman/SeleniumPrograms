package interview;

public class ReverseNumber {
	
	private void rever() {
		int inputNumber =123456789;
		int reverseNumber=0;
		
		while (inputNumber!=0) {
			reverseNumber=reverseNumber*10;
			reverseNumber=reverseNumber+inputNumber%10;
			inputNumber=inputNumber/10;
			
		}
		System.out.println(reverseNumber);
		
	}
public static void main(String[] args) {
	ReverseNumber r= new ReverseNumber();
	r.rever();
}
}

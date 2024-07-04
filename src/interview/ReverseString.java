package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {
	
	public static void stringBuffer() {
		String input = "Super";
		
		StringBuffer buffer = new StringBuffer();
		buffer.append(input);
		System.out.println("reverse:  "+buffer.reverse());
	}
	public static void reverse1() {
		String s= "i am Attending the interview";
		
		String[] words =s.split(" ");
		
		String reverseString = "";
		
		for (String word : words) {
			String reverseword = "";
		for (int i = words.length-1; i>=0; i--) {
			reverseword =reverseword+ words[i];
		}
		reverseString = reverseword +" ";
		}
		System.out.println(reverseString);
	}
	
	public static void reverse2() {
		 
		String input = "Bhargav";
		
		char[] charArray = input.toCharArray();
		
		String reverse="";
		
		for (int i=charArray.length-1;i>=0;i--) {
			reverse= reverse+charArray[i];
		}
		System.out.println(reverse);
		
	}
	public static void reverse3() {
		
		String name ="Hanuman";
		
		char[] array = name.toCharArray();
		
		String rev="";
		
		for (int i =array.length-1; i >=0; i--) {
			
			rev = rev+ array[i];	
			}
		
		System.out.println("rev :"+rev);
	}
	public static void useCollection() {
		String name = "I Am Selected";
		
		char[] charArray = name.toCharArray();
		
	List<Character>	list = new ArrayList<Character>();
	
	for (Character character : charArray) {
		list.add(character);
		
	}
		Collections.reverse(list);
		ListIterator<Character> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			Character character = (Character) listIterator.next();
			System.out.print(character);
		}
		
	}
	
	public static void example1() {
		
		String name1 ="Suray Narayanan";
		
		char[] charArray1 = name1.toCharArray();
		String rev1= " ";
		for (int x =charArray1.length-1;x>=0; x--) {
		
			rev1= rev1+charArray1[x];
			
		}
		System.err.println(rev1);
	
		String name2 ="Sathya Narayanan";
		String rev ="/";
		
		StringBuffer buffer1 = new StringBuffer();
		buffer1.append(name2);
		System.out.println(rev+buffer1.reverse());
		
	}
	
	
	public static void main(String[] args) {
		stringBuffer();
		reverse1();
		reverse2();
		reverse3();
		useCollection();
		example1();
	}

}

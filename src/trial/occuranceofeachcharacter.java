package trial;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class occuranceofeachcharacter {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		
		Map<Character,Integer> count=new HashMap<Character,Integer>();
		
		char[] ch=s.toCharArray();
		
		for(char c:ch) {
			if(count.containsKey(c)) {
				count.put(c,count.get(c)+1);
			}
			else {
				count.put(c, 1);
			}
		}
		System.out.println(count);
		

	}

}

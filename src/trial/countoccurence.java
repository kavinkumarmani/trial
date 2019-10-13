package trial;

import java.util.HashMap;
import java.util.Map;

public class countoccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mazaa";
		
		Map<Character,Integer>count1=new HashMap<Character,Integer>();
		
		char[] ch=s.toCharArray();
		for(char c:ch) {
			if(count1.containsKey(c)) {
				count1.put(c, count1.get(c)+1);
			}
			else {
				count1.put(c, 1);
			}
		}
		System.out.println(count1);
	}

}

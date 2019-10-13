package trial;

import java.util.Arrays;

public class removeduplicateelementsin_array {

	public static void main(String[] args) {
		
//		int [] x= {2,3,4,4,6,7,8,4,3,6,9};
//		
//		int[] removeele=Arrays.stream(x).distinct().toArray();
//		for(int i=0;i<removeele.length;i++) {
//			System.out.println(removeele[i]);
//		}
//		
		int[] y= {1,2,2,3,4,5,6,1,6,7,89,9};
		int[] output=Arrays.stream(y).distinct().toArray();
		for(int ele:output) {
			System.out.println(ele);
		}

	}

}

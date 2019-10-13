package trial;

import java.util.Arrays;
import java.util.Scanner;

public class scanner1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of array");
		int length=sc.nextInt();
		
		System.out.println("enter the array elements");
		
		int[] num=new int[length];
		
		for(int i=0;i<length;i++) {
			
			num[i]=sc.nextInt();
		}
		
		System.out.println("array elements are :"+Arrays.toString(num));
		
		Arrays.sort(num);
		
		System.out.println("sorted array are");
		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}

	}

}

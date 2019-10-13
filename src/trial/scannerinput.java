package trial;

import java.util.Arrays;
import java.util.Scanner;

public class scannerinput {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of array");
		int length=sc.nextInt();
		
		System.out.println("Enter the elements of the array:");
		
		int [] num=new int[length];
		
		for(int i=0;i<length;i++) {
			num[i]=sc.nextInt();
		}
		
		System.out.println("the array elements are "+Arrays.toString(num));

	}

}

package trial;

public class largest1st_second {

	public static void main(String[] args) {
		
		int num[]= {2,3,4,89,56,45,44,22};
		int firstlargest=0;
		int secondlargest=0;
		
		for(int i=0;i<num.length;i++) {
			if(firstlargest<num[i]) {
				firstlargest=num[i];
			}
			else if(secondlargest<num[i]) {
				secondlargest=num[i];
			}
		}
		System.out.println(firstlargest);
		System.out.println(secondlargest );
	

	}

}

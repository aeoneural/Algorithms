package simple_algorithms;

import java.util.Scanner;

public class encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] k = {1,2,3,4,5};
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		char[] a = new char [input.length()];
		a = input.toCharArray();
		
		for(int i=0; i<a.length; i++){
			if(i%a.length < a.length){
				a[i] = a[i%a.length];		
			}
			
		
		}
		
		
		
		
		
		
	}

}

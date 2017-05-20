 package factorial;

import java.util.Scanner;

public class Factorial {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scn = new Scanner(System.in);
//		int num = scn.nextInt();
//		int result = 1;
//		while(num > 1) {
//			result = result*num;
//			num--;
//		}
//		System.out.println(result);
//		
//	}
	
	public static int fac(int n){
		int result = 1;
		while(n > 1) {
			result = result*n;
			n--;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(fac(n));
	}


}

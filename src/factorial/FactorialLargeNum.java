package factorial;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialLargeNum {

	public static BigInteger fac(BigInteger num2){
		BigInteger result = new BigInteger("2");
		if(num2.compareTo(result) <= 0) return num2;
		
		BigInteger tempNum = new BigInteger("3");
		for(int loop = 2; loop < num2.intValue(); loop++) {
			result = result.multiply(tempNum);
			tempNum = tempNum.add(BigInteger.ONE);
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		while(true) {
			BigInteger num = new BigInteger(String.valueOf(scn.nextInt()));
			System.out.println(fac(num).toString());
		}
		
	}

}

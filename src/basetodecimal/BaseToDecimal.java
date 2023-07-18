package basetodecimal;

import java.util.Scanner;

public class BaseToDecimal {
	public static int baseToDecimal(int number,int index)
	{
		int start =0;
		int result =0;
		while(number > 0)
		{
			result += (number%10)*Math.pow(index,start);
			start++;
			number = number/10;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int index = scanner.nextInt();
		int result = baseToDecimal(number,index);
		System.out.println(result);
		

	}

}

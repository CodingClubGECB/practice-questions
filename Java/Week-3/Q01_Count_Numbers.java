//Write a program to count the number of digits in a number.

import java.util.Scanner;

public class Q01_Count_Numbers{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		while(n != 0){
			count++;
			n = n / 10;
		}
		System.out.println(count);
	}
}

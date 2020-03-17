//5.Write a program to find GCD of two numbers. 

import java.util.Scanner;

public class Q05_GCD{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.println(gcd(x, y));
	}
	
	public static int gcd(int a, int b){
		if(a == 0)
			return b;
		return gcd(b % a, a);
	}
}

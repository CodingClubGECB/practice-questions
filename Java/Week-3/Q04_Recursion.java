//4.Write a program to find the power of a number using recursion

import java.util.*;

public class Q04_Recursion{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int n = in.nextInt();
		System.out.println(pow(x, n));
	}
	
	public static int pow(int x, int n){
		if(n == 0){
			return 1;
		}else{
			return x * pow(x, n-1);
		}
	}
}

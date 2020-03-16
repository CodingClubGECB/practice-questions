//2.Write a program to check whether a number is positive or negative. 

import java.util.Scanner;
import java.lang.Math;

public class Q03_Amstrong{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = 0, c = n, a;
		while(c != 0){
			p++;
			c = c / 10;
		}
		c = n;
		a = 0;
		for(int i = 0; i < p; ++i){
			a += Math.pow(c % 10, p);
			c = c / 10;
		}
		if(n == a){
			System.out.println("Amstrong Number");
		}else{
			System.out.println("Not Amstrong Number");
		}
	}
}

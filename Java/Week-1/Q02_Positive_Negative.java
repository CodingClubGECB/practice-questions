//2.Write a program to check whether a number is positive or negative. 

import java.util.Scanner;

public class Q02_Positive_Negative{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n >= 0){
			System.out.println(n + " is positive");
		}else{
			System.out.println(n + " is negative");
		}
	}
}

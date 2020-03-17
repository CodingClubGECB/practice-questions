//4.Write a program to check whether a given year is leap year or not. 

import java.util.Scanner;

public class Q04_Leap_Year{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if((n % 4 == 0) & (n % 100 != 0) | (n % 400 == 0)){
			System.out.println("Leap Year");
		}else{
			System.out.println("Not Leap Year");
		}
	}
}

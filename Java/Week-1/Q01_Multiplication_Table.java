//1.Write a program to print the multiplication table of a number upto 10.

import java.util.Scanner;

public class Q01_Multiplication_Table{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0; i <= 10; ++i){
			System.out.println(n + " x " + i + " = " + n * i);
		}
	}
}

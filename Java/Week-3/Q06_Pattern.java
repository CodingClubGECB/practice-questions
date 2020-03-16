//6.Write a program to print the following pattern:


import java.util.*;

public class Q06_Pattern{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0; i < n; ++i){
			for(int j = 0; j < n - i; ++j){
				System.out.print(" ");
			}
			for(int j = 1; j <= i*2+1; ++j){
				if((j % 2) == 0){
					System.out.print("A");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

//3.Write a program to find the average of numbers in an array.

import java.util.*;

public class Q03_Average{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		float avg = 0;
		for(int i = 0; i < n; ++i){
			a.add(in.nextInt());
		}
		for(int i = 0; i < n; ++i){
			avg += a.get(i);
		}
		avg = avg / n;
		System.out.println(avg);
	}
}

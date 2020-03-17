//6.Write a program to print hollow rectangle in star pattern. 

public class Q06_Pattern{
	public static void main(String[] args){
		for(int i = 0; i < 5; ++i){
			System.out.print("* ");
		}
		System.out.print("\n* ");
		for(int i = 0; i < 3; ++i){
			System.out.print("  ");
		}
		System.out.println("* ");
		for(int i = 0; i < 5; ++i){
			System.out.print("* ");
		}
		System.out.println();
	}
}

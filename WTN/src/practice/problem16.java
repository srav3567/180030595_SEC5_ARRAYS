package practice;

import java.util.*;
public class problem16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter an integer number");
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}
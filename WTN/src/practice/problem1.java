package practice;

import java.util.*;
public class problem1
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    if(a>0){
	        System.out.println("Positive");
	    }
	    else if(a==0)
	    {
	        System.out.println("Zero");
	    }
	    else
	    {
	        System.out.println("Negative");
	        sc.close();
	    }
	
	}
}

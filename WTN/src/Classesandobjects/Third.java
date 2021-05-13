package Classesandobjects;

import java.util.Scanner;
public class Third {
	 public static void main(String[] args) {
	        BMICalc();
	        BMICalcBonus1();
	        BMICalcBonus1FeetInches();
	    }

	    public static void BMICalc() {
	        Scanner sc = new Scanner(System.in);
	        double height, weight, BMI;
	        System.out.print("Your height in m: ");
	        height = sc.nextDouble();
	        System.out.print("Your weight in kg: ");
	        weight = sc.nextDouble();
	        BMI = weight / (height * height);
	        System.out.println();
	        System.out.println("Your BMI is " + BMI);
	    }

	    public static void BMICalcBonus1() {
	        Scanner sc = new Scanner(System.in);
	        double height, weight, BMI;
	        System.out.print("Your height in inches: ");
	        height = sc.nextDouble();
	        System.out.print("Your weight in pounds: ");
	        weight = sc.nextDouble();
	        BMI = weight * (703 / (height * height));
	        System.out.println();
	        System.out.println("Your BMI is " + BMI);
	    }
	    public static void BMICalcBonus1FeetInches() {
	        Scanner sc = new Scanner(System.in);
	        double height, heightFeet, heightInches, weight, BMI;
	        System.out.print("Your height (feet only): ");
	        heightFeet = sc.nextDouble();
	        System.out.print("Your height (inches): ");
	        heightInches = sc.nextDouble();
	        System.out.print("Your weight in pounds: ");
	        weight = sc.nextDouble();
	        height = heightFeet * 12 + heightInches;
	        BMI = weight * (703 / (height * height));
	        System.out.println();
	        System.out.println("Your BMI is " + BMI);
	    }

}

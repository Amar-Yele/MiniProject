package Calculator;

import java.util.Scanner;

//Make a simple calculator program in java.

class Operations {
	
	Scanner scan = new Scanner(System.in);
	
	protected int num1;
	protected int num2;
		
	public void inputArr() {
		int[] input = {1, 2, 3, 4, 5};
		
		System.out.println("Choose "+input[0]+" for addition :: ");
		System.out.println("Choose "+input[1]+" for Multiplication :: ");
		System.out.println("Choose "+input[2]+" for Substraction :: ");
		System.out.println("Choose "+input[3]+" for Division :: ");
		System.out.println("Want you to find Area then Choose "+input[4]+" :: ");
		int inp = scan.nextInt();
		System.out.println("I have Choosed "+inp);
		
		if(inp == input[4]) {
			int input2[] = {1, 2, 3, 4};
			System.out.println("Choose "+input2[0]+" for Area of Square :: ");
			System.out.println("Choose "+input2[1]+" for Area of Rectangle :: ");
			System.out.println("Choose "+input2[2]+" for Area of triangle :: ");
			System.out.println("Choose "+input2[3]+" for Area of Circle :: ");
			int inp2 = scan.nextInt();
			System.out.println("I have Choosed "+inp2);
			
			if(inp2 == input2[0]) {
				System.out.println("Enter length of Square :: ");
				int num7 = scan.nextInt();
				System.out.println("Area of Square is :: "+num7*num7);
				System.out.println("\nThank You! Have a Great Day!");
			}
			else if(inp2 == input2[1]) {
				System.out.println("Enter Length :: ");
				int length = scan.nextInt();
				
				System.out.println("Enter Breadth ::");
				int breadth = scan.nextInt();
				
				System.out.println("Area of Rectangle is :: "+length*breadth);
				System.out.println("\nThank You! Have a Great Day!");
			}
			else if(inp2 == input2[2]) {
				System.out.println("Enter Height of Triangle :: ");
				int Height = scan.nextInt();
				
				System.out.println("Enter Base of Triangle :: ");
				int Base = scan.nextInt();
				
				float areaOfTriangle = (Height*Base)/2;
				System.out.println("Area of Triangle is :: "+areaOfTriangle);
				System.out.println("\nThank You! Have a Great Day!");
			}
			else if(inp2 == input2[3]){
				
				double pi = 3.14;
				System.out.println("Enter the Radius :: ");
				int radius = scan.nextInt();
				double AreaOfCircle = pi*radius*radius;
				System.out.println("Area of Circle :: "+AreaOfCircle);
				System.out.println("\nThank You! Have a Great Day!");
			}
			else {
				System.out.println("000! Wrong Sysntax!\nMake sure you have choose write number");
			}
		}

		else if(inp == input[0]) {
			System.out.println("Enter the Num 1 :: ");
			num1 = scan.nextInt();
			System.out.println("\nEnter the Num 2 :: ");
			num2 = scan.nextInt();
			int num3 = num1+num2;
			System.out.println("Addtion is :: "+num3);
			System.out.println("\nThank You! Have a Great Day!");
		}
		else if(inp == input[1]) {
			System.out.println("Enter the Num 1 :: ");
			num1 = scan.nextInt();
			System.out.println("\nEnter the Num 2 :: ");
			num2 = scan.nextInt();
			int num4 = num1*num2;
			System.out.println("Multiplication is :: "+num4);
			System.out.println("\nThank You! Have a Great Day!");
		}
		else if(inp == input[2]) {
			System.out.println("Enter the Num 1 :: ");
			num1 = scan.nextInt();
			System.out.println("\nEnter the Num 2 :: ");
			num2 = scan.nextInt();
			int num5 = num1-num2;
			System.out.println("Substraction is :: "+num5);
			System.out.println("\nThank You! Have a Great Day!");
		}
		else if(inp == input[3]) {
			System.out.println("Enter the Num 1 :: ");
			num1 = scan.nextInt();
			System.out.println("\nEnter the Num 2 :: ");
			num2 = scan.nextInt();
			int num6 = num1/num2;
			System.out.println("Division is :: "+num6);
			System.out.println("\nThank You! Have a Great Day!");
		}
		else{
			System.out.println("OOPs! Wrong Sysntax!\nMake sure you have choose write number");
		}
	}
}

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println("\nHey there! Welcome to JAVA Calci!!\n");
		
		Operations op = new Operations();
		op.inputArr();
	}
}

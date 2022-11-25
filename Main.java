package Workshop08;

import java.util.Scanner;

import Workshop08.RightTriangle.IllegalRightTriangleException;
import Workshop08.RightTriangle.IllegalTriangleException;

public class Main {
	
	public static void main(String[] args) {
		int a, b, c;
		Scanner nhap = new Scanner(System.in);
		while (true) {
		try {
			a=nhap.nextInt();
			b=nhap.nextInt();
			c=nhap.nextInt();
		} catch (Exception e) {
			throw new IllegalArgumentException("Invalid input");
		}
		
		try {
		//call constructor of RightTriangle class
		RightTriangle rt = new RightTriangle(a, b, c);
		System.out.println("This is a right triangle!");
		} catch (IllegalTriangleException e1) {
			System.out.println("This is not a Triangle");
		} catch (IllegalRightTriangleException e2) {
			System.out.println("This is not a right triangle");
		}
		//continue?
		System.out.print("Continue?(y/n):");
		//Enter a character
		char chon = nhap.next().charAt(0);
		if(chon != 'y') 
		break;
		}
		}
			
}

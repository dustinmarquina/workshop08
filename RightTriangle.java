package Workshop08;

import java.util.Scanner;

public class RightTriangle {
	int a, b, c;
	
	
	public RightTriangle(int a, int b, int c) throws IllegalTriangleException, IllegalRightTriangleException{ {
	if (a+b<=c||b+c<=a||a+c<=b) {
		throw new IllegalTriangleException("Triangle violet the rule. ");
			}
	}
	if ((Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2))!=c)) {
		throw new IllegalRightTriangleException("Not right");
	}
}

	class IllegalTriangleException extends Exception{
		IllegalTriangleException(String s){
			super(s);
		}
	}
	class IllegalRightTriangleException extends Exception{
		IllegalRightTriangleException(String s){
			super(s);
		}
	}

}



	

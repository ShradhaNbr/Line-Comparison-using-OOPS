package LineComparison;

import java.util.Scanner;

public class LineComparison {
	public static double findLength(int x1, int x2, int y1, int y2) {
		double lengthOfLine = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y1-y2),2));
		System.out.println("Length of line is " + lengthOfLine);
		return lengthOfLine;
		
	}
public static void main(String[] args) {
	int x1, x2, y1, y2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of x1 oordinate");
	x1=sc.nextInt();
	System.out.println("Enter the value of x2 coordinate");
	x2=sc.nextInt();
	System.out.println("Enter the value of y1 coordinate");
	y1=sc.nextInt();
	System.out.println("Enter the value of y2 coordinate");
	y2=sc.nextInt();
	LineComparison lineCompare = new LineComparison();
	lineCompare.findLength(x1, x2,y1,y2);
	sc.close();
}
}

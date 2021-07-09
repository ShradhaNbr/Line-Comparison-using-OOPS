package LineComparison;

import java.util.Scanner;

public class LineComparison {

	public void findLength(int x1, int x2, int y1, int y2, int x3, int x4, int y3, int y4) {
		double lengthOfLine1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		double lengthOfLine2 = Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
		compareLines(lengthOfLine1, lengthOfLine2);
	}

	public void compareLines(double lengthOfLine1, double lengthOfLine2) {
		String s1 = String.valueOf(lengthOfLine1);
		String s2 = String.valueOf(lengthOfLine2);
		double compare = s2.compareTo(s1);
		if (compare > 0) {
			System.out.println("Line2 is greater than Line1");
		} else if (compare < 0) {
			System.out.println("Line1 is greater than Line2");
		} else
			System.out.println("Lines are equal");
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x1, x2, x3, x4, y1, y2, y3, y4;
		System.out.println("Welcome to Line Comparison Computation Program");
		System.out.println("Enter the first point of line1");
		x1 = sc.nextInt();
		System.out.println("Enter the second point of line1");
		x2 = sc.nextInt();
		System.out.println("Enter the third point of line1");
		y1 = sc.nextInt();
		System.out.println("Enter the fourth number of line1");
		y2 = sc.nextInt();
		System.out.println("Enter the first point of line2");
		x3 = sc.nextInt();
		System.out.println("Enter the second point of line2");
		x4 = sc.nextInt();
		System.out.println("Enter the third point of line2");
		y3 = sc.nextInt();
		System.out.println("Enter the fourth point of line2");
		y4 = sc.nextInt();
		LineComparison lineCompare = new LineComparison();
		lineCompare.findLength(x1, x2, y1, y2, x3, x4, y3, y4);
		sc.close();

	}
}
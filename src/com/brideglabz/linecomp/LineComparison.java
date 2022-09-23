package com.brideglabz.linecomp;

public class LineComparison {

	/*
	 * UC-3 - compare two lines based on the end points, that I know one line is
	 * equal, greater or less than the other line.
	 */

	public static void main(String[] args) {
		System.out.println("WELCOME TO LINE COMPARISON COMPUTATION PROGRAM....!!");
		int x1 = 20, y1 = 70;
		int x2 = 9, y2 = 67;
		int x3 = 2, y3 = 7;
		int x4 = 9, y4 = 7;

		Double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		Double length2 = Math.sqrt(Math.pow(x3 - x4, 2) + Math.pow(y3 - y4, 2));
		/*
		 * The wrapper class in Java provides the mechanism to 
		 * convert primitive into object and object into primitive
		 * 
		 * Equality or compareTo doesn't work on primitive type
		 * 
		 * The equals() method compares two strings, and returns true if the strings are
		 * equal, and false if not
		 * 
		 */
		System.out.println("Length of first line : " + length1);

		System.out.println("Length of second line : " + length2);

		System.out.println(length1.compareTo(length2));

		if (length1.compareTo(length2) == 1)
			System.out.println("line one is greater than line two");
		else if (length1.compareTo(length2) == -1)
			System.out.println("line one is less than line two");
		else
			System.out.println("both lines are equal");
	}

}
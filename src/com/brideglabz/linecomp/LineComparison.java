package com.brideglabz.linecomp;

public class LineComparison {

	/*
	 * UC-2 - check equality of two lines based on the end points, that when two
	 * lines are the equal.
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

		System.out.println(length1.equals(length2));

		if (length1.equals(length2))
			System.out.println("Both lines are of same length");
		else
			System.out.println("Both the lines are of different length");

	}

}

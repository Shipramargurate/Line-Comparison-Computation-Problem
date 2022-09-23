package com.brideglabz.linecomp;

public class LineComparison {

	// UC-1 - Taking coordinates and calculating the length of a line

	public static void main(String[] args) {
		System.out.println("WELCOME TO LINE COMPARISON COMPUTATION PROGRAM....!!");
		int x1 = 20, y1 = 70;
		int x2 = 9, y2 = 67;

		double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Length of Line : " + length);
	}

}

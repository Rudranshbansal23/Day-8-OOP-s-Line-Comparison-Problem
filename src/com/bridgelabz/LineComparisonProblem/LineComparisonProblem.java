package com.bridgelabz.LineComparisonProblem;

public class LineComparisonProblem {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		int x1 = 15, x2 = 150, y1 = 65, y2 = 200;
		int length = (int) Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
		System.out.println("Length of the line (" + x1 + ", " + x2 + ") and (" + y1 + ", " + y2 + ") is " + length);
	}
}
package com.epsilon.programs;

import java.util.Arrays;

public class GetQuotient {
	public static void main(String[] args) {
		// System.out.println(Arrays.toString(args));
		try {
			String a1 = args[0];
			String a2 = args[1];
			int n = Integer.parseInt(a1);
			int d = Integer.parseInt(a2);
			int q = n / d;
			System.out.println("Quotient of " + n + " / " + d + " = " + q);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Two inputs expected");
		} catch (NumberFormatException e) {
			System.err.println("Only integer values allowed");
		} catch (ArithmeticException e) {
			System.err.println("Cannot divide by zero");
			//throw new RuntimeException("This is a dummy Exception!");
			//System.exit(12); - will not print the "finally" statement
		} catch (Exception e) {// fallback/default: must always be the last one.
			// If this block is given in the beginning, an error would have occurred for the
			// following catches as all other catches are instances of this catch
			System.err.println("There was a problem: " + e.getMessage());
		} finally {
			System.out.println("This works in most cases!");
		}
		System.out.println("End of main");
	}

}

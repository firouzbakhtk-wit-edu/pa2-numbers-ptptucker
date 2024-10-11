package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	      // Input values for a, b, and c
       System.out.printf("Enter a b c: ");
       double a = scanner.nextDouble();
       double b = scanner.nextDouble();
       double c = scanner.nextDouble();

       // Calculate the discriminant
       double discriminant = b * b - 4 * a * c;

       // Check the value of the discriminant and solve accordingly
       if (discriminant < 0) {
           // Imaginary roots
           System.out.printf("Roots: imaginary%n");
       } else if (discriminant == 0) {
           // One real root
           double root = -b / (2 * a);
           System.out.printf("Root: %.2f%n", root);
       } else {
           // Two real roots
           double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
           double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

           // Ensure the roots are printed in increasing order
           if (root1 > root2) {
               double temp = root1;
               root1 = root2;
               root2 = temp;
           }

           System.out.printf("Roots: %.2f" + ", %.2f%n", root1, root2);
       }

       scanner.close();
   }

	}
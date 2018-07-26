import static java.lang.System.out;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EulerApproximation {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		out.println("Welcome to my Euler approximation calculator!");
		out.println("(Pronounced 'Oiler')");
		out.println("This was made for lazy calc students by yours truly <3");
		out.println();
		out.println("Disclaimer: I am not responsible if you fail your calc class.");
		out.println("            The choice to use this calculator is yours and yours alone.");
		out.println("            If you do not understand how to use Euler's method of approximation");
		out.println("            I suggest you learn by doing the problems yourself...");
		out.println("            or hmu @ vuangelina72@gmail.com ;)");
		out.println();
		out.println("Let's begin!");
		out.println("Please enter the equation of the derivative in terms of x and y IN THE CODE (look for green) and re-run the program");
		out.println("(I didn't know how to take an equation as input Wink Wonk)");
		
		out.println();
		out.println("Input the given value of x");
		double x = keyboard.nextDouble();
		out.println();
		out.println("Input the corresponding value of y");
		double y = keyboard.nextDouble();
		out.println("Value (" + x + "," + y + ") has been inputted");
		
		out.println();
		out.println("Enter the x value of the desired approximation");
		double xf = keyboard.nextDouble();
		
		out.println();
		out.println("Enter the NUMBER OF STEPS, NOT the step size");
		double numSteps = keyboard.nextDouble();
		out.println("Calculating...");
		double stepSize = (xf-x)/numSteps;
		DecimalFormat stepSizeFormatter = new DecimalFormat("0.###");
		out.println("Step size = " + stepSizeFormatter.format(stepSize));
		out.println();
		keyboard.close();
		
		int steps = 0;
		
		while (steps != numSteps) {
		
			/* *********EQUATION GOES BELOW******** */
			
			double equation = x/y;
			
			/* Make sure to properly use parentheses. Excessive parentheses > No parentheses!
			Use "*" for multiplication.
			Do NOT include dy/dx, f', y', etc. or spaces.
			Don't forget the semicolon!*/
			
		double derivPre = equation;
		out.println(derivPre);
		double approx = y + (derivPre*stepSize);
		x += stepSize;
		DecimalFormat xFormatter = new DecimalFormat("0.###");
		out.println("x= " + xFormatter.format(x));
		y = approx;
		steps += 1;
		DecimalFormat approxFormatter = new DecimalFormat("0.###");
		out.println("y =~ " + approxFormatter.format(approx));
		out.println();
		}
	}
}

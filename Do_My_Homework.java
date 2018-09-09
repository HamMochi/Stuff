import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
import java.text.DecimalFormat;

public class Do_My_Homework {
	public static void main(String args[]) {

		// Add values to array
		Scanner input = new Scanner(System.in);
		out.println("How many values do you want to enter?");
		int num = input.nextInt();
		float array[] = new float[num];
		int n = array.length;
		out.println("Enter the " + num + " values now.");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextFloat();
		}
		input.close();

		// Puts values in ascending order
		Arrays.sort(array);
		out.println();

		out.println("5-NUMBER SUMMARY");

		// Minimum
		float minimum = array[0];
		out.println("Minimum: " + minimum);

		// Q1
		float firstHalf[] = new float[num / 2];
		for (int i = 0; i < firstHalf.length; i++) {
			firstHalf[i] = array[i];
		}
		median(firstHalf, "Q1: ");

		// Median
		median(array, "Median: ");

		// Q3
		float secondHalf[] = new float[num / 2];
		for (int i = 0; i < secondHalf.length; i++) {
			secondHalf[i] = array[(int) (Math.ceil(n / 2.0) + i)];
		}
		median(secondHalf, "Q3: ");

		// Maximum
		float maximum = array[n - 1];
		out.println("Maximum: " + maximum);

		out.println();

		// Range
		float range = maximum - minimum;
		out.println("Range " + range);

		out.println();

		// IQR
		// out.println();
		// float IQR = array[] - array[0];
		// out.println("IQR: " + IQR);

		// Outlier
		// for(int i = 0; i <= n; i++) {
		// if(array[i] < (a)-(1.5*IQR)||array[i] > (b)+(1.5*IQR)) {
		// float numOutliers += 1;
		// float outliers[] = new float[numOutliers];
		// } else {
		// out.println("No outliers.");
		// }
		// }

		// Mean
		float mean = 0;
		float sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + array[i];
			mean = sum / num;
		}
		out.println("Mean: " + mean);

		// Standard Deviation
		float summation = 0;
		float variance = 0;
		for (int i = 0; i < n; i++) {
			summation += Math.pow(array[i] - mean, 2);
		}
		variance = summation / (array.length - 1);
		DecimalFormat sDevFormatter = new DecimalFormat("0.###");
		out.println("Standard Deviation: " + sDevFormatter.format(Math.sqrt(variance)));
	}

	public static int median(float array[], String prefix) {
		int n = array.length;
		int halfway;
		if (n % 2 == 0) {
			halfway = (n / 2) - (1);
			float one = array[halfway];
			float two = array[halfway + 1];
			float median = (one + two) / 2;
			out.println(prefix + median);
		} else {
			halfway = n / 2;
			out.println(prefix + array[halfway]);
		}
		return halfway;
	}
}

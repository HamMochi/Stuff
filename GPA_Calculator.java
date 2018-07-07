import static java.lang.System.out;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GPA_Calculator {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		out.println("Welcome to my GPA calculators!");
		out.println("Let's begin!");
		out.println("Please select which calculator you would like to use by typing the corresponding number.");
		out.println("Unweighted Standard (0)");
		out.println("Unweighted YB (1)");
		out.println("Weighted Standard (2)");
		out.println("UC GPA (3)");
		out.println();
		
		int counter = 0;
		double totalScore = 0;
		String selectCalculator = keyboard.next();
		
		switch (selectCalculator) {
		case "0":
			out.println("How many a-g courses have you taken?");
			double numCourses = keyboard.nextInt();
			out.println("How many A's/A+'s have you earned?");
			double gradeA = keyboard.nextInt();
			double Ascore = gradeA * 4.0;
			totalScore += Ascore;
			counter += gradeA;
		
			if(counter != numCourses) {
				out.println("How many A-'s have you earned?");
				double lowgradeA = keyboard.nextInt();
				double lowAscore = lowgradeA * 3.7;
				totalScore += lowAscore;
				counter += lowgradeA;
			}
		
			if(counter != numCourses) {
				out.println("How many B+'s have you earned?");
				double highGradeB = keyboard.nextInt();
				double highBscore = highGradeB * 3.3;
				totalScore += highBscore;
				counter += highGradeB;
			}
		
			if(counter != numCourses) {
				out.println("How many B's have you earned?");
				double gradeB = keyboard.nextInt();
				double Bscore = gradeB * 3.0;
				totalScore += Bscore;
				counter += gradeB;
			}
		
			if(counter != numCourses) {
				out.println("How many B-'s have you earned?");
				double lowGradeB = keyboard.nextInt();
				double lowBscore = lowGradeB * 2.7;
				totalScore += lowBscore;
				counter += lowGradeB;
			}
		
			if(counter != numCourses) {
				out.println("How many C+'s have you earned?");
				double highGradeC = keyboard.nextInt();
				double highCscore = highGradeC * 2.3;
				totalScore += highCscore;
				counter += highGradeC;
			}
		
			if(counter != numCourses) {
				out.println("How many C's have you earned?");
				double gradeC = keyboard.nextInt();
				double Cscore = gradeC * 2.0;
				totalScore += Cscore;
				counter += gradeC;
			}
			
			if(counter != numCourses) {
				out.println("How many C-'s have you earned?");
				double lowGradeC = keyboard.nextInt();
				double lowCscore = lowGradeC * 1.7;
				totalScore += lowCscore;
				counter += lowGradeC;
			}
		
			if(counter != numCourses) {
				out.println("How many D+'s have you earned?");
				double highGradeD = keyboard.nextInt();
				double highDscore = highGradeD * 1.3;
				totalScore += highDscore;
				counter += highGradeD;
			}
		
			if(counter != numCourses) {
				out.println("How many D's have you earned?");
				double gradeD = keyboard.nextInt();
				double Dscore = gradeD * 1.0;
				totalScore += Dscore;
				counter += gradeD;
			}
		
			if(counter != numCourses) {
				out.println("How many D-'s have you earned?");
				double lowGradeD = keyboard.nextInt();
				double lowDscore = lowGradeD * 0.7;
				totalScore += lowDscore;
				counter += lowGradeD;
			}
		
			if(counter != numCourses) {
				out.println("How many F's have you earned?");
				double gradeF = keyboard.nextInt();
				double Fscore = gradeF * 2.3;
				totalScore += Fscore;
				counter += gradeF;
			}
			double GPA = totalScore/numCourses;
			DecimalFormat GPAformatter = new DecimalFormat("0.###");
			out.println("GPA: " + GPAformatter.format(GPA));
			break;
		case "1":
			out.println("Note: Ignore +'s and -'s");
			out.println("How many a-g courses have you taken?");
			double numCourses1 = keyboard.nextInt();
			out.println("How many A's have you earned?");
			double gradeA1 = keyboard.nextInt();
			double Ascore1 = gradeA1 * 4.0;
			totalScore += Ascore1;
			counter += gradeA1;
			
			if(counter != numCourses1) {
				out.println("How many B's have you earned?");
				double gradeB = keyboard.nextInt();
				double Bscore = gradeB * 3.0;
				totalScore += Bscore;
				counter += gradeB;
			}
			if(counter != numCourses1) {
				out.println("How many C's have you earned?");
				double gradeC = keyboard.nextInt();
				double Cscore = gradeC * 2.0;
				totalScore += Cscore;
				counter += gradeC;
			}
			if(counter != numCourses1) {
				out.println("How many D's have you earned?");
				double gradeD = keyboard.nextInt();
				double Dscore = gradeD * 1.0;
				totalScore += Dscore;
				counter += gradeD;
			}
			if(counter != numCourses1) {
				out.println("How many F's have you earned?");
				double gradeF = keyboard.nextInt();
				double Fscore = gradeF * 0;
				totalScore += Fscore;
				counter += gradeF;
			}
			double GPA1 = totalScore/numCourses1;
			DecimalFormat GPAformatter1 = new DecimalFormat("0.###");
			out.println("GPA: " + GPAformatter1.format(GPA1));
			break;
		}
	}
}

			
			
			
			
			
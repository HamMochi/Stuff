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
		out.println("Weighted YB (3)");
		out.println("UC GPA (4)");
		out.println();
		
		int counter = 0;
		double totalScore = 0;
		String selectCalculator = keyboard.next();
		
		switch (selectCalculator) {
		case "0":
			out.println("Unweighted standard calculator selected");
			out.println("How many semesters of a-g courses have you taken?");
			double numCourses = keyboard.nextInt();
			out.println("How many A's/A+'s have you earned?");
			double gradeA = keyboard.nextInt();
			double Ascore = gradeA * 4.0;
			totalScore += Ascore;
			counter += gradeA;
		
			if(counter < numCourses) {
				out.println("How many A-'s have you earned?");
				double lowgradeA = keyboard.nextInt();
				double lowAscore = lowgradeA * 3.7;
				totalScore += lowAscore;
				counter += lowgradeA;
			}
			if(counter < numCourses) {
				out.println("How many B+'s have you earned?");
				double highGradeB = keyboard.nextInt();
				double highBscore = highGradeB * 3.3;
				totalScore += highBscore;
				counter += highGradeB;
			}
			if(counter < numCourses) {
				out.println("How many B's have you earned?");
				double gradeB = keyboard.nextInt();
				double Bscore = gradeB * 3.0;
				totalScore += Bscore;
				counter += gradeB;
			}
			if(counter < numCourses) {
				out.println("How many B-'s have you earned?");
				double lowGradeB = keyboard.nextInt();
				double lowBscore = lowGradeB * 2.7;
				totalScore += lowBscore;
				counter += lowGradeB;
			}
			if(counter < numCourses) {
				out.println("How many C+'s have you earned?");
				double highGradeC = keyboard.nextInt();
				double highCscore = highGradeC * 2.3;
				totalScore += highCscore;
				counter += highGradeC;
			}
			if(counter < numCourses) {
				out.println("How many C's have you earned?");
				double gradeC = keyboard.nextInt();
				double Cscore = gradeC * 2.0;
				totalScore += Cscore;
				counter += gradeC;
			}
			if(counter < numCourses) {
				out.println("How many C-'s have you earned?");
				double lowGradeC = keyboard.nextInt();
				double lowCscore = lowGradeC * 1.7;
				totalScore += lowCscore;
				counter += lowGradeC;
			}
			if(counter < numCourses) {
				out.println("How many D+'s have you earned?");
				double highGradeD = keyboard.nextInt();
				double highDscore = highGradeD * 1.3;
				totalScore += highDscore;
				counter += highGradeD;
			}
			if(counter < numCourses) {
				out.println("How many D's have you earned?");
				double gradeD = keyboard.nextInt();
				double Dscore = gradeD * 1.0;
				totalScore += Dscore;
				counter += gradeD;
			}
			if(counter < numCourses) {
				out.println("How many D-'s have you earned?");
				double lowGradeD = keyboard.nextInt();
				double lowDscore = lowGradeD * 0.7;
				totalScore += lowDscore;
				counter += lowGradeD;
			}
			if(counter < numCourses) {
				out.println("How many F's have you earned?");
				double gradeF = keyboard.nextInt();
				double Fscore = gradeF * 0;
				totalScore += Fscore;
				counter += gradeF;
			}
			
			if(counter == numCourses) {
				double GPA = totalScore/numCourses;
			DecimalFormat GPAformatter = new DecimalFormat("0.####");
			out.println("GPA: " + GPAformatter.format(GPA));
			break;
			} else {
				out.println("Error. Check math and try again.");
				break;
			}
		case "1":
			out.println("Unweighted YB calculator selected");
			out.println("Note: Ignore +'s and -'s");
			out.println("How many semesters of a-g courses have you taken?");
			double numCourses1 = keyboard.nextInt();
			out.println("How many A's have you earned?");
			double gradeA1 = keyboard.nextInt();
			double Ascore1 = gradeA1 * 4.0;
			totalScore += Ascore1;
			counter += gradeA1;
			
			if(counter < numCourses1) {
				out.println("How many B's have you earned?");
				double gradeB = keyboard.nextInt();
				double Bscore = gradeB * 3.0;
				totalScore += Bscore;
				counter += gradeB;
			}
			if(counter < numCourses1) {
				out.println("How many C's have you earned?");
				double gradeC = keyboard.nextInt();
				double Cscore = gradeC * 2.0;
				totalScore += Cscore;
				counter += gradeC;
			}
			if(counter < numCourses1) {
				out.println("How many D's have you earned?");
				double gradeD = keyboard.nextInt();
				double Dscore = gradeD * 1.0;
				totalScore += Dscore;
				counter += gradeD;
			}
			if(counter < numCourses1) {
				out.println("How many F's have you earned?");
				double gradeF = keyboard.nextInt();
				double Fscore = gradeF * 0;
				totalScore += Fscore;
				counter += gradeF;
			}
			
			if(counter == numCourses1) {
				double GPA1 = totalScore/numCourses1;
			DecimalFormat GPAformatter1 = new DecimalFormat("0.####");
			out.println("GPA: " + GPAformatter1.format(GPA1));
			break;
			} else {
				out.println("Error. Check math and try again.");
				break;
			}
		case "2":
			out.println("Weighted standard calculator selected");
			out.println("How many semesters of a-g courses have you taken?");
			double numCourses2 = keyboard.nextInt();
			out.println("How many A's/A+'s have you earned?");
			double gradeA2 = keyboard.nextInt();
			double Ascore2 = gradeA2 * 4.0;
			totalScore += Ascore2;
			counter += gradeA2;
		
			if(counter < numCourses2) {
				out.println("How many A-'s have you earned?");
				double lowgradeA2 = keyboard.nextInt();
				double lowAscore2 = lowgradeA2 * 3.7;
				totalScore += lowAscore2;
				counter += lowgradeA2;
			}
			if(counter < numCourses2) {
				out.println("How many B+'s have you earned?");
				double highGradeB2 = keyboard.nextInt();
				double highBscore2 = highGradeB2 * 3.3;
				totalScore += highBscore2;
				counter += highGradeB2;
			}
			if(counter < numCourses2) {
				out.println("How many B's have you earned?");
				double gradeB2 = keyboard.nextInt();
				double Bscore2 = gradeB2 * 3.0;
				totalScore += Bscore2;
				counter += gradeB2;
			}
			if(counter < numCourses2) {
				out.println("How many B-'s have you earned?");
				double lowGradeB2 = keyboard.nextInt();
				double lowBscore2 = lowGradeB2 * 2.7;
				totalScore += lowBscore2;
				counter += lowGradeB2;
			}
			if(counter < numCourses2) {
				out.println("How many C+'s have you earned?");
				double highGradeC2 = keyboard.nextInt();
				double highCscore2 = highGradeC2 * 2.3;
				totalScore += highCscore2;
				counter += highGradeC2;
			}
			if(counter < numCourses2) {
				out.println("How many C's have you earned?");
				double gradeC2 = keyboard.nextInt();
				double Cscore2 = gradeC2 * 2.0;
				totalScore += Cscore2;
				counter += gradeC2;
			}
			if(counter < numCourses2) {
				out.println("How many C-'s have you earned?");
				double lowGradeC2 = keyboard.nextInt();
				double lowCscore2 = lowGradeC2 * 1.7;
				totalScore += lowCscore2;
				counter += lowGradeC2;
			}
			if(counter < numCourses2) {
				out.println("How many D+'s have you earned?");
				double highGradeD2 = keyboard.nextInt();
				double highDscore2 = highGradeD2 * 1.3;
				totalScore += highDscore2;
				counter += highGradeD2;
			}
			if(counter < numCourses2) {
				out.println("How many D's have you earned?");
				double gradeD2 = keyboard.nextInt();
				double Dscore2 = gradeD2 * 1.0;
				totalScore += Dscore2;
				counter += gradeD2;
			}
			if(counter < numCourses2) {
				out.println("How many D-'s have you earned?");
				double lowGradeD2 = keyboard.nextInt();
				double lowDscore2 = lowGradeD2 * 0.7;
				totalScore += lowDscore2;
				counter += lowGradeD2;
			}
			if(counter < numCourses2) {
				out.println("How many F's have you earned?");
				double gradeF2 = keyboard.nextInt();
				double Fscore2 = gradeF2 * 0;
				totalScore += Fscore2;
				counter += gradeF2;
			}
			
			if(counter == numCourses2) {
				out.println("How many semesters of AP/IB classes have you taken?");
				double APIB2 = keyboard.nextInt();
				totalScore += APIB2;
				out.println("How many semesters of school-designated honors courses have you taken?");
				double honors2 = keyboard.nextInt();
					totalScore += honors2/2;
			} else {
				out.println("Error. Check math and try again.");
				break;
			}
			double GPA2 = totalScore/numCourses2;
			DecimalFormat GPAformatter2 = new DecimalFormat("0.####");
			out.println("GPA: " + GPAformatter2.format(GPA2));
			break;
		case "3":
			out.println("Weighted YB calculator selected");
			out.println("Note: Ignore +'s and -'s");
			out.println("How many semesters of a-g courses have you taken?");
			double numCourses3 = keyboard.nextInt();
			out.println("How many A's have you earned?");
			double gradeA3 = keyboard.nextInt();
			double Ascore3 = gradeA3 * 4.0;
			totalScore += Ascore3;
			counter += gradeA3;
			
			if(counter < numCourses3) {
				out.println("How many B's have you earned?");
				double gradeB3 = keyboard.nextInt();
				double Bscore3 = gradeB3 * 3.0;
				totalScore += Bscore3;
				counter += gradeB3;
			}
			if(counter < numCourses3) {
				out.println("How many C's have you earned?");
				double gradeC3 = keyboard.nextInt();
				double Cscore3 = gradeC3 * 2.0;
				totalScore += Cscore3;
				counter += gradeC3;
			}
			if(counter < numCourses3) {
				out.println("How many D's have you earned?");
				double gradeD3 = keyboard.nextInt();
				double Dscore3 = gradeD3 * 1.0;
				totalScore += Dscore3;
				counter += gradeD3;
			}
			if(counter < numCourses3) {
				out.println("How many F's have you earned?");
				double gradeF3 = keyboard.nextInt();
				double Fscore3 = gradeF3 * 0;
				totalScore += Fscore3;
				counter += gradeF3;
			}
			
			if(counter == numCourses3) {
				out.println("How many semesters of AP/IB classes have you taken?");
				double APIB3 = keyboard.nextInt();
				totalScore += APIB3;
				out.println("How many semesters of school-designated honors courses have you taken?");
				double honors3 = keyboard.nextInt();
					totalScore += honors3/2;
			} else {
				out.println("Error. Check math and try again.");
				break;
			}
			double GPA3 = totalScore/numCourses3;
			DecimalFormat GPAformatter3 = new DecimalFormat("0.####");
			out.println("GPA: " + GPAformatter3.format(GPA3));
			break;
		case "4":
			out.println("UC GPA calculator selected");
			out.println("Note: - Ignore +'s and -'s");
			out.println("      - The UC GPA is capped at a maximum of 8 semesters of honors courses");
			out.println("        with no more than 4 semesters of 10th grade honors courses");
			out.println("How many semesters of a-g courses have you taken from the summer after freshmen year to the summer after junior year?");
			double numCourses4 = keyboard.nextInt();
			out.println("How many A's have you earned?");
			double gradeA4 = keyboard.nextInt();
			double Ascore4 = gradeA4 * 4.0;
			totalScore += Ascore4;
			counter += gradeA4;
			
			if(counter < numCourses4) {
					out.println("How many B's have you earned?");
					double gradeB4 = keyboard.nextInt();
				double Bscore4 = gradeB4 * 3.0;
				totalScore += Bscore4;
				counter += gradeB4;
			}
			if(counter < numCourses4) {
				out.println("How many C's have you earned?");
				double gradeC4 = keyboard.nextInt();
				double Cscore4 = gradeC4 * 2.0;
				totalScore += Cscore4;
				counter += gradeC4;
			}
			if(counter < numCourses4) {
				out.println("How many D's have you earned?");
				double gradeD4 = keyboard.nextInt();
				double Dscore4 = gradeD4 * 1.0;
				totalScore += Dscore4;
				counter += gradeD4;
			}
			if(counter < numCourses4) {
				out.println("How many F's have you earned?");
				double gradeF4 = keyboard.nextInt();
				double Fscore4 = gradeF4 * 0.0;
				totalScore += Fscore4;
				counter += gradeF4;
			}
			
			if(counter == numCourses4) {
				out.println("How many semesters of AP/IB classes did you PASS(C or better) in 10th grade?");
				out.println("Note: Honors weight is not granted for school-designated honors courses.");
				double honors10 = keyboard.nextInt();
				if(honors10 <= 4) {
					totalScore += honors10;
				} else if(honors10 > 4) {
					totalScore += 4;
				} else {
					totalScore += 0;
				}
				out.println("How many semesters of AP/IB classes did you PASS(C or better) in 11th grade?");
				double honors11 = keyboard.nextInt();
				if(honors11 <= 4) {
					totalScore += honors11;
				} else if(honors11 > 4) {
					totalScore += 4;
				} else {
					totalScore += 0;
				}
			} else {
				out.println("Error. Check math and try again.");
				break;
			}
			double GPA4 = totalScore/numCourses4;
			DecimalFormat GPAformatter4 = new DecimalFormat("0.####");
			out.println("GPA: " + GPAformatter4.format(GPA4));
			break;
		}
	}
}

			
			
			
			
			
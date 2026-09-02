import java.util.Scanner;

public class GradeCalculator {public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = in.next();
    System.out.println("CSE131 Grade for: " + name);
    System.out.println("How many studios have you attended?");
    int studiosAttended = in.nextInt();
    System.out.println("Number of studios attended: " + studiosAttended);
    double weightedStudiosGrade = Math.round(studiosAttended / 8.0 * 10 * 100) / 100.0;
    System.out.println("Weighted studio grade (out of 10): " + weightedStudiosGrade + "%");
    System.out.println("What is your average lecture quiz grade?");
    double averageLectureQuizGrade = in.nextDouble();
    System.out.println("Average lecture quiz grade: " + averageLectureQuizGrade);
    double weightedAverageLectureQuizGrade = Math.round(averageLectureQuizGrade / 100.0 * 12 * 100) / 100.0;
    System.out.println("Weighted lecture quiz grade (out of 12): " + weightedAverageLectureQuizGrade + "%");
    System.out.println("What is your average code evaluation grade?");
    double averageCodeEvaluationGrade = in.nextDouble();
    System.out.println("Average code evaluation grade: " + averageCodeEvaluationGrade);
    double weightedAverageCodeEvaluationGrade = Math.round(averageCodeEvaluationGrade / 100.0 * 18 * 100) / 100.0;
    System.out.println("Weighted average code evaluation grade (out of 18): " + weightedAverageCodeEvaluationGrade + "%");
    System.out.println("What is your average exam grade?");
    double averageExamGrade = in.nextDouble();
    System.out.println("Average exam grade: " + averageExamGrade);
    double weightedAverageExamGrade = Math.round(averageExamGrade / 100.0 * 60 * 100) / 100.0;
    System.out.println("Weighted exam grade (out of 60): " + weightedAverageExamGrade + "%");
    double totalGrade = Math.round((weightedStudiosGrade + weightedAverageLectureQuizGrade + weightedAverageCodeEvaluationGrade + weightedAverageExamGrade) * 100) / 100.0;
    System.out.println("Total Grade: " + totalGrade + "%");
    }
}

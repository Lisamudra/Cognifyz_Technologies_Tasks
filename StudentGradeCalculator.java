import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("=>============Welcome Student Grade Calculator============<=");
        System.out.println("============================================================");
        System.out.println("Enter The Number Of Grades");

        int grades = s.nextInt();
        int[] arr = new int[grades];

        int grade = 1;
        for (int i = 0; i < grades; i++) {
            System.out.println("Enter The Grade Marks: " + grade);
            arr[i] = s.nextInt();
            grade++;
        }

        int total = 0;
        for (int i = 0; i < grades; i++) {
            total = arr[i] + total;
        }

        double avg = (double) total / grades;
        System.out.println("Your Average Of Grade = " + avg);
        System.out.println("=>===Thank You===<=");
    }

}

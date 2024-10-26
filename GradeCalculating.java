import java.util.Scanner;

public class GradeCalculating {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("vize1: ");
        int final_not1 = scanner.nextInt();

        System.out.print("vize2: ");
        int final_not2 = scanner.nextInt();

        System.out.print("vize3: ");
        int final_not3 = scanner.nextInt();

        float final_not= ((final_not1 + final_not2 + final_not3)/3);
        String grade;

        if (final_not >= 90 && final_not <= 100) {
            grade = "AA";
        } else if (final_not >= 85 && final_not < 90) {
            grade = "BA";
        } else if (final_not >= 80 && final_not < 85) {
            grade = "BB";
        } else if (final_not >= 75 && final_not < 80) {
            grade = "CB";
        } else if (final_not >= 70 && final_not < 75) {
            grade = "CC";
        } else if (final_not >= 65 && final_not < 70) {
            grade = "DC";
        } else if (final_not >= 60 && final_not < 65) {
            grade = "DD";
        } else if (final_not >= 50 && final_not < 60) {
            grade = "FF";
        } else {
            System.out.println("Invalid final_not. Please enter a number between 0 and 100.");
            scanner.close();
            return;
        }

        System.out.println("The grade for a final_not of " + final_not + " is: " + grade);

        scanner.close();
    }
}




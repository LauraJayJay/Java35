package basics;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a grade");

        int grade = scanner.nextInt();


        //IF
        //Print out "Grate job" if the grade is over 6
        if (grade > 6) {
            System.out.println("Good job");
        }
        //Print out "You can do better" if the grade is less or equal then 4

        if (grade <= 4) {
            System.out.println("You can do better");
        }

        //IF ELSE
        //Print "You passed the test" if grade is grader or equal then 4
        //but if its not "You have failed your test"

        if (grade >= 4) {
            System.out.println("You passed the test");
        } else {
            System.out.println("You have failed your test");
        }

        //Same logic

        if (grade < 4) {
            System.out.println("You have failed your test");
        } else {
            System.out.println("You passed the test");
        }

        //IF ELSE

        //Print comments about the grade
        // 1-3 --> "very bad"
        // 4-5 --> "okay"
        // 6 --> "nice"
        // 7-10 --> "very good"
        //if not in the range 1-10 --> "Invalid input"


        if (grade >= 1 && grade <= 3) {
            System.out.println("very bad");
        } else if (grade == 4 || grade == 5) {
            System.out.println("okay");
        } else if (grade == 6) {
            System.out.println("nice");
        } else if (grade > 6 && grade < 11) {
            System.out.println("very good");
        } else {
            System.out.println("invalid input");
        }
    }
}


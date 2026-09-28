import java.util.*;

public class QuizApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> questions = new ArrayList<>();
        ArrayList<String> answers = new ArrayList<>();

        questions.add("1. Which language is platform independent?\n"
                + "A. C\nB. Java\nC. Python");
        answers.add("B");

        questions.add("2. Which keyword creates an object?\n"
                + "A. class\nB. new\nC. static");
        answers.add("B");

        questions.add("3. Which collection stores unique elements?\n"
                + "A. List\nB. Set\nC. ArrayList");
        answers.add("B");

        questions.add("4. Which keyword is used to inherit a class?\n"
                + "A. extends\nB. implements\nC. inherit");
        answers.add("A");

        questions.add("5. Which method is the entry point of a Java program?\n"
                + "A. start()\nB. main()\nC. run()");
        answers.add("B");

        int score = 0;

        System.out.println("================================");
        System.out.println("          JAVA QUIZ");
        System.out.println("================================");

        for (int i = 0; i < questions.size(); i++) {

            System.out.println("\n" + questions.get(i));
            System.out.print("Enter your answer (A/B/C): ");

            try {

                String ans = sc.nextLine().trim().toUpperCase();

                // Only A, B or C is accepted
                if (!ans.matches("[ABC]")) {
                    throw new IllegalArgumentException("Invalid option! Please enter A, B or C.");
                }

                if (ans.equals(answers.get(i))) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong!");
                    System.out.println("Correct answer: " + answers.get(i));
                }

            } catch (IllegalArgumentException e) {

                System.out.println(e.getMessage());

                // Ask the same question again
                i--;
            }
        }

        int totalQuestions = questions.size();
        int wrongAnswers = totalQuestions - score;
        double percentage = ((double) score / totalQuestions) * 100;

        System.out.println("\n================================");
        System.out.println("          QUIZ RESULT");
        System.out.println("================================");

        System.out.println("Total Questions : " + totalQuestions);
        System.out.println("Correct Answers : " + score);
        System.out.println("Wrong Answers   : " + wrongAnswers);
        System.out.println("Final Score     : " + score + "/" + totalQuestions);
        System.out.printf("Percentage      : %.2f%%%n", percentage);

        if (percentage >= 80) {
            System.out.println("Result          : Excellent!");
        } else if (percentage >= 60) {
            System.out.println("Result          : Good!");
        } else if (percentage >= 40) {
            System.out.println("Result          : Average");
        } else {
            System.out.println("Result          : Needs Improvement");
        }

        System.out.println("================================");

        sc.close();
    }
}

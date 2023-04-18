import java.util.Scanner;

public class CarbonFootprintQuiz {

    public static void main(String[] args) {

        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Define the questions and answers
        String[][] questionsAndAnswers = {
                {"What is the topic of this tutorial?", "A. Animals", "B. Technology", "C. Art", "D. Food", "B"},
                {"What are some negative impacts of technology on the environment?", "A. Increased air quality", "B. Reduced deforestation", "C. Pollution", "D. More green spaces", "C"},
                {"How is a person's carbon footprint calculated?", "A. Home energy + Food + Transportation", "B. Home energy x 0.67 + Transportation x 0.23 + Food x 0.1", "C. Home energy - Transportation - Food", "D. Home energy / Transportation * Food", "B"},
                {"What are some negative impacts of technology on human health?", "A. Improved sleep patterns", "B. Reduced eye strain", "C. Obesity", "D. Improved mental health", "C"},
                {"What are some positive impacts of technology on human health?", "A. Increased addiction", "B. Improved mental health apps", "C. Increased sedentary activities", "D. Increased eye strain", "B"},
                {"What are some positive impacts of technology on education?", "A. Increased isolation", "B. Decreased access to education", "C. Personalized learning experiences", "D. Less collaboration", "C"},
                {"What are some positive impacts of technology on the workplace?", "A. Increased productivity", "B. Decreased communication", "C. Less flexibility", "D. Increased cost", "A"},
                {"What are some negative impacts of technology on the environment?", "A. Deforestation", "B. Reduced greenhouse gas emissions", "C. Increased air quality", "D. Reduced pollution", "A"},
                {"What is electronic waste?", "A. Waste created by using paper products", "B. Waste created by using electronic devices", "C. Waste created by using plastic products", "D. Waste created by using metal products", "B"},
                {"What is the formula to calculate carbon footprint?", "A. Home energy x 0.67 + Transportation x 0.23 + Food x 0.1", "B. Home energy + Food + Transportation", "C. Home energy - Transportation - Food", "D. Home energy / Transportation * Food", "A"}
        };

        // Define a variable to store the user's score
        int score = 0;

        // Ask each question and check the user's answer
        for (int i = 0; i < questionsAndAnswers.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questionsAndAnswers[i][0]);
            System.out.println(questionsAndAnswers[i][1]);
            System.out.println(questionsAndAnswers[i][2]);
            System.out.println(questionsAndAnswers[i][3]);
            System.out.println(questionsAndAnswers[i][4]);

            // Read the user's answer
            String userAnswer = "";
            while (true) {
                System.out.print("Enter your answer (A/B/C/D): ");
                try {
                    userAnswer = scanner.nextLine();
                    if (userAnswer.equalsIgnoreCase("A") || userAnswer.equalsIgnoreCase("B")
                            || userAnswer.equalsIgnoreCase("C") || userAnswer.equalsIgnoreCase("D")) {
                        break;
                   
                    } else {
                        throw new Exception("Invalid input. Please enter A, B, C, or D.");
                        }
                        } catch (Exception e) {
                        System.out.println(e.getMessage());
                        }
                        }
                                // Check the user's answer and update their score
        if (userAnswer.equalsIgnoreCase(questionsAndAnswers[i][5])) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect.");
        }
    }

    // Display the user's final score
    System.out.println("\nYou got " + score + " out of " + questionsAndAnswers.length + " correct.");
}
}
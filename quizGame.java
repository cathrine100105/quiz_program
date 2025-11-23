import java.util.Scanner;

public class quizGame {
    public static void main(String[] args) {

        String[] questions = {"1. What is the main function of a route?",
                              "2. Which part of the computer is considerd the brain",
                              "3. What year was facebook launched?",
                              "4. Who is known as the father of computer?",
                              "5. What was the first programming language?"};

        String[][] options ={{"1. Storing files","2. Encrypting Data","3. Directing internet", "4. Managing Passwords"},
                             {"1. CPU", "2.Hard Drive","3. RAM","4. GPU"},
                             {"1. 2000", "2. 2004","3. 2006","4. 2008"},
                             {"1. Steve jobs", "2. Bill Gates","3. Allan Turing","4. Charles Babbage"},
                             {"1. COBOL", "2. C","3. Fortran","4. Assembly"}};

        int[] answers ={3, 1, 2,4,3};
        int score=0;
        int guess;

        Scanner obj = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("Welcome to the java Quiz Game!");
        System.out.println("******************************");

        for(int i=0; i<questions.length;i++){
            System.out.println(questions[i]);

            for(String option: options[i]){
                System.out.println(option);
            }

            System.out.print("Enter your Guess: ");
            guess = obj.nextInt();

            if(guess == answers[i]){
                System.out.println("*******");
                System.out.println("CORRECT");
                System.out.println("*******");
                score++;
            }
            else {
                System.out.println("*******");
                System.out.println("WRONG");
                System.out.println("*******");
            }
        }
        System.out.println("Your final score is: "+ score+ " out of "+questions.length);
        obj.close();
    }
}

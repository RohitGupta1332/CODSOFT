import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String head = """
                Welcome to guess the number challenge!
                You have 5 Attempts!""";
        System.out.println(head);
        System.out.println();
        int attempt;
        boolean playAgain = true;
        while(playAgain){
            attempt = 0;
            int r = random.nextInt(101);
            while(attempt != 5){
                System.out.print("Guess a number from 1 to 100: ");
                int n = sc.nextInt();
                if(n < 0 || n > 100){
                    System.out.println("You entered an Invalid number");
                    continue;
                }
                if(n == r){
                    System.out.println("Congratulations! you guessed the correct number.");
                    break;
                }
                else if(n > r){
                    System.out.println("Your guess was " + n + " too high!");
                    System.out.println("Try again!");
                }
                else{
                    System.out.println("Your guess was "  +  n + " too low!");
                    System.out.println("Try again!");

                }
                System.out.println();
                attempt++;
            }

                if(attempt == 5){
                    System.out.println("The number was " + r);
                    System.out.println("Your attempts are over!");
                }
                 System.out.println("Do you want to play another round? Yes/No");
                String st = sc.next();
                if(!st.equalsIgnoreCase("yes"))
                    playAgain = false;

        }
        System.out.println("Thank you for playing!");
    }
}

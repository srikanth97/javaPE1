import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Exercise1_8 {
    public static void guessNumber() {
        int num =(int) (Math.random()*50 + 1);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an Integer between 0 and 50");
        int guess = in.nextInt();
        int min = 0,max =50;
        while (true){
            if(num == guess){
                System.out.println("You guessed Correctly");
                break;
            }
            else if (num > guess){
                System.out.printf("Enter a number between %d and %d",guess,max);
                min = guess;
            }
            else{
                System.out.printf("Enter a number between %d and %d",min,guess);
                max = guess;
            }
            System.out.println();
            guess = in.nextInt();
        }
    }
}

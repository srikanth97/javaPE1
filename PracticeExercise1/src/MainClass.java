import java.util.Scanner;

public class MainClass {
    public static void main(String args[]) {
        boolean b;
        if(b= false)

        while(true) {
            System.out.println();
            System.out.println("1:Palindrome \t 2:Tom and Jerry \t 3:Vowel and Consonant \n 4:Iteration \t 5:Sum of Integers \t" +
                    "6:Indentify Char \t 7:Sort Integer \n 8:Guess Number \t 9:Reverse String \t 10:String Repeat \t 11:Exit");
            System.out.println("Select an option:-");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            switch (num){
                case 1:
                    Exercise1_1 q1 = new Exercise1_1();
                    q1.palindrome();
                    break;
                case 2:
                    exercise1_2 q2 = new exercise1_2();
                    q2.tomJerry();
                    break;
                case 3:
                    Exercise1_3 q3 = new Exercise1_3();
                    q3.vowelConsonant();
                    break;
                case 4:
                    Exercise1_4.iteration();
                    break;
                case 5:
                    Exercise1_5.total();
                    break;
                case 6:
                    Exercise1_6.indentification();
                    break;
                case 7:
                    Exercise1_7.sortNumber();
                    break;
                case 8:
                    Exercise1_8.guessNumber();
                    break;
                case 9:
                    Exercise1_9.reverseString();
                    break;
                case 10:
                    Exercise1_10.outputString();
                    break;
                case 11:
                    return;
                default:
                    System.out.println("Enter a valid Choice");
            }
        }
    }
}

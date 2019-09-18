import java.util.Scanner;
public class Exercise1_1 {
    public static void palindrome(){
        int num;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        if(num < 10){
            System.out.println("Single digit cannot be identified as palindrome");
            return;
        }
        int dupNum = num,revNum = 0,sum = 0;
        while (dupNum !=  0){
            int remainder = dupNum%10;
            revNum = revNum*10 + remainder;
            if(remainder%2 == 0){
                sum= sum + remainder;
            }
            dupNum = dupNum/10;
        }
        if(revNum != num){
            System.out.printf("%d Is not a palindrome", num);
            return;
        }
        else if( sum > 25){
            System.out.printf("%d is a palindrome and sum is greater than 25",num);
            return;
        }
        else {
            System.out.printf("%d is a palindrome and sum is not greater than 25",num);
            return;
        }
    }
}

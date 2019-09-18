import java.util.Scanner;

public class Exercise1_6 {
    public static void indentification() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a character");
        String input = sc.next();
        if(input.length() > 1){
            System.out.println("Please enter one character");
        }
        else {
            char inputChar = input.charAt(0);
            if(inputChar>64 && inputChar <91){
                System.out.println("Capital Letter");
            }else  if(inputChar>96 && inputChar <123){
                System.out.println("Small Letter");
            }else if(inputChar>47 && inputChar <58){
                System.out.println("Digit ");
            }else{
                System.out.println("Special Character");
            }
        }
    }
}

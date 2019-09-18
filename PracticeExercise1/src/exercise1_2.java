import java.util.Scanner;

public class exercise1_2 {
    public  void tomJerry() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number between 20 and 30");
        int num = sc.nextInt();

        if( (num%2 != 0) &&(num>20 && num<30)){
            System.out.println("Tom");
        }
        else if( (num%2 == 0) &&(num>20 && num<30)){
            System.out.println("Jerry");
        }
        else{
            System.out.println("Enter a number between 20 and 30");
        }
    }
}

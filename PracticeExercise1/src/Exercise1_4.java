import java.util.Scanner;

public class Exercise1_4 {
    public static void iteration() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your an Integer:-");
        int num = sc.nextInt();
        for(int i = 1 ;i<=num;i++){
            int j = 0;
            while(j<i){
                System.out.print(i);
                j++;
            }
        }
    }
}

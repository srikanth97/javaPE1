import java.util.Scanner;

public class Exercise1_5 {
    public static void total() {
        int sum = 0;
        System.out.println("Enter integers to add:-");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] array = str.split(" ");
        for(String temp:array){
            try {
                sum = sum + (int) Integer.valueOf(temp);
            }catch (Exception e){
                System.out.println("Please enters all integers");
            }
        }
        System.out.printf("Sum of integers entered %d",sum);
    }
}

import java.util.Scanner;

public class Exercise1_10 {
    public static void outputString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:-");
        String str = sc.next();
        System.out.print("Enter Integer:-");
        int num = sc.nextInt();
        if(num > str.length()){
            num = str.length();
        }
        String sub = str.substring(str.length()-num);
        System.out.print(str);
        for(int i =1;i<num;i++){
            System.out.print(sub);
        }
    }
}

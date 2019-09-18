import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Exercise1_7 {
    public static void sortNumber() {
        System.out.println("Enter an Integer:-");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0,i =0;
        String str = Integer.toString(num);
        char[] array = str.toCharArray();
        Arrays.sort(array);
        while(num != 0 ){
            int rem = num%10;
            if( rem%2 == 0){
                sum = sum + rem;
            }
            num = num/10;

            i++;
        }
        for(int j = 0;j < array.length/2;j++){
            char temp = array[j];
            array[j] = array[array.length -1 - j];
            array[array.length -1-j] = temp;
        }
        System.out.print("Sorted Nummber");
        System.out.println(array);

        System.out.printf("Sum of even numbers:%d",sum);
        System.out.println();
        System.out.println(sum>15);
    }
}

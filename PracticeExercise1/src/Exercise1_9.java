import java.util.Scanner;

public class Exercise1_9 {
    public static void reverseString() {
        System.out.println("Enter a string:");
        Scanner in = new Scanner(System.in);
        String input = in.next();
        char[] array = input.toCharArray();
        for(int j = 0;j<array.length/2;j++){
            char temp = array[j];
            array[j] = array[array.length-1-j];
            array[array.length-1-j] = temp;
        }
        System.out.print("Reverse String");
        System.out.println(array);
    }
}

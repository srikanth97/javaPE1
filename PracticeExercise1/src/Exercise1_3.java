import java.util.Scanner;

public class Exercise1_3 {
    public void vowelConsonant(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your Input:-");
        String input = sc.next();
        for(char r: input.toCharArray()){
            if((r>64 && r < 91) || (r>96 && r< 123)){
                if(r == 'a' ||r == 'e' ||r == 'i' ||r == 'o' ||r == 'u' ||r == 'A' ||r == 'E' ||r == 'I' ||r == 'O' ||r == 'U' ){
                    System.out.printf("%s-vowel \t",r);
                }
                else {
                    System.out.printf("%s-consonant \t",r);
                }
            }
            else {
                System.out.printf("%s-Not alphabet \t",r);
            }
        }
    }
}

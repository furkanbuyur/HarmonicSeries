import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double result = 0;

        System.out.print("Enter a number : ");
        n = sc.nextInt();

        while(n != 0){
            result += 1.0/n ;
            n--;
        }
        System.out.println("Result : "+ result );
    }
}
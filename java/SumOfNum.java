import java.util.Scanner;
public class SumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; 
        }
        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
        sc.close();
    }
}

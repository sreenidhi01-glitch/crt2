import java.util.Scanner;
public class EvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Even digits in " + number + " are: ");
        int temp = number;
        if (temp == 0) {
            System.out.print("0");
        } else {
            while (temp != 0) {
                int digit = temp % 10; 
                if (digit % 2 == 0) {  
                    System.out.print(digit + " ");
                }
                temp = temp / 10; 
            }
        }
        sc.close();
    }
}

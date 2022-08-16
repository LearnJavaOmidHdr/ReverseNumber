import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number = reader.nextInt();
        int number2 = 0;
        while (number != 0) {
            System.out.print(number % 10);
            number2 = number2 * 10;
            number = number / 10;
        }
    }
}


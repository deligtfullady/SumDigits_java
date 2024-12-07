import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int digits = in.nextInt();
        System.out.println("Сумма цифр равна " + sumDigits(digits));
    }
    public static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number/=10;
        }
        return sum;
    }
}




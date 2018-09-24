import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter first number: ");
        firstNumber = enter.nextInt();
        System.out.println("Enter second number: ");
        secondNumber = enter.nextInt();

        firstNumber = Math.abs(firstNumber);
        secondNumber = Math.abs(secondNumber);

        if (firstNumber == 0 || secondNumber == 0)
            System.out.println("No greatest common factor");

        while (firstNumber != secondNumber) {
            if (firstNumber > secondNumber)
                firstNumber = firstNumber - secondNumber;
            else
                secondNumber = secondNumber - firstNumber;
        }
        System.out.println("Greatest common factor: " + firstNumber);

    }
}

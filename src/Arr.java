
import java.util.Scanner;

public class Arr {

    static Scanner sc = new Scanner(System.in);
    static double[] numbers;

    public static void main(String[] args) {
        fillArray();
        printTheArray();
        calculateAvrage();

    }

    public static void fillArray() {
        System.out.print("How many numbers do you want to calculate the avrage of? ");

        int amount = sc.nextInt();
        numbers = new double[amount];

        for (int i = 0; i < amount; i++) {

            System.out.print("Give me number" + (i + 1) + ": ");
            numbers[i] = sc.nextDouble();

        }
    }

    public static void printTheArray() {
        System.out.println("******************");
        System.out.println("Printing the array");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            
        }

    }

    public static void calculateAvrage() {
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];
        }
        System.out.print( "\n The avarage is " );
        System.out.printf("%.2f", sum / numbers.length);
        System.out.println("");

    }

}

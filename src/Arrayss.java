
import java.util.Scanner;

public class Arrayss {

    static Scanner sc = new Scanner(System.in);
    static double[] numbers;

    public static void fillArray() {

        System.out.println("How many numbers? ");

        int amount = sc.nextInt();
        numbers = new double[amount];

        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextDouble();
        }
        
    }

    public static void calculateAvrage() {

        double sum = 0;

        for (int i = 0; i <numbers.length; i++) {
            sum = sum + numbers[i];
        }


        double avrage = sum / numbers.length;
        System.out.println("The avarage is: "+avrage);
    }

    public static void main(String[] args) {
        fillArray();
        calculateAvrage();

    }
}

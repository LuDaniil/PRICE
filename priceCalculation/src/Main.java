import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        int count = scanner.nextInt();
        System.out.println(priceCalculation(price, count));
    }
    static double priceCalculation(double price, int count) {
        double evaluation = price*count; //Твой код здесь
        return (evaluation);
    }
}
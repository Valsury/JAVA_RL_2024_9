import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayListSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создаем список для хранения чисел
        ArrayList<Double> numbers = new ArrayList<>();

        // Запрашиваем у пользователя пять чисел
        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            double number = scanner.nextDouble();
            numbers.add(number);
        }

        // Вычисляем сумму чисел
        double sum = ArrayListSum.sum(numbers);

        // Отображаем сумму
        System.out.println("The sum of the numbers is: " + sum);
    }
}
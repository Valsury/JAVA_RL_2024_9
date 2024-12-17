import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayListSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<Integer> numbers = new ArrayList<>();


        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            numbers.add(number);
        }


        ArrayListSort.sort(numbers);


        System.out.println("Sorted numbers in ascending order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
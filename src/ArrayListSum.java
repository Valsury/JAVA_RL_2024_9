import java.util.ArrayList;

public class ArrayListSum {

    public static double sum(ArrayList<Double> list) {
        double totalSum = 0.0;
        for (double number : list) {
            totalSum += number;
        }
        return totalSum;
    }
}
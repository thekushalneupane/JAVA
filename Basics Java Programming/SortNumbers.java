 //WAP to sort n numbers
import java.util.*;

class NumberSorter {
    private int num[], n;

    public void inputNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers to sort:");
        n = sc.nextInt();
        num = new int[n];
        System.out.println("Enter " + n + " numbers to sort:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
    }

    public void sortNumbers() {
        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }

    public void displayNumbers() {
        System.out.println("Numbers in ascending order:");
        for (int number : num) {
            System.out.print(number + " ");
        }
        System.out.println(); // For newline after printing all numbers
    }
}

public class SortNumbers   {
    public static void main(String[] args) {
        NumberSorter N = new NumberSorter();
        N.inputNumbers();
        N.sortNumbers();
        N.displayNumbers();
    }
}

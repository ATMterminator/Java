import java.util.Scanner;
public class SumFromStartToEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end number: ");
        int end = scanner.nextInt();
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("The sum from " + start + " to " + end + " is: " + sum);
    }
}

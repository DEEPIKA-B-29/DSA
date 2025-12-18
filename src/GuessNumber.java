import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int N = (int) Math.pow(2, n);
        int low = 0;
        int high = N - 1;

        System.out.println("Think of a number between 0 and " + (N - 1));
        while (low < high) {
            int mid = low + (high - low) / 2;

            System.out.println("Is no. between " + low + " and " + mid + "? (true/false)");
            boolean answer = obj.nextBoolean();
            if (answer) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Your number is: " + low);
    }
}

import java.util.Arrays;
import java.util.Scanner;

class BinarySearch {

    public static void main(String args[]) {
        String input = "apple,banana,grape,orange,mango";
        String words[] = input.split(",");
        Arrays.sort(words);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word to search: ");
        String key = sc.next();

        int low = 0, high = words.length - 1;
        int mid;
        boolean found = false;

        while (low <= high) {
            mid = (low + high) / 2;

            if (words[mid].equals(key)) {
                found = true;
                break;
            } else if (words[mid].compareTo(key) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (found)
            System.out.println("Word FOUND in the list");
        else
            System.out.println("Word NOT FOUND in the list");

        sc.close();
    }
}

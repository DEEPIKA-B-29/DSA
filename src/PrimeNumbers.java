public class PrimeNumbers {

    public static void main(String[] args) {

        int[] primes = new int[1000];
        int count = 0;

        for (int i = 2; i <= 1000; i++) {
            boolean flag = false;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                primes[count++] = i;
            }
        }

        System.out.println("Prime Numbers:");
        for (int i = 0; i < count; i++) {
            System.out.print(primes[i] + " ");
        }

        System.out.println("\nPalindrome Prime Numbers:");
        for (int i = 0; i < count; i++) {
            int num = primes[i];
            int temp = num;
            int rev = 0;

            while (temp > 0) {
                int d = temp % 10;
                rev = rev * 10 + d;
                temp = temp / 10;
            }

            if (rev == num) {
                System.out.print(num + " ");
            }
        }

    }
}

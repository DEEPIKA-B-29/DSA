import java.util.Scanner;

public class MergeSort {

    public static void mergeSort(String[] a, int lo, int hi) {
        if (hi - lo <= 1) {
            return;
        }

        int mid = lo + (hi - lo) / 2;

        mergeSort(a, lo, mid);
        mergeSort(a, mid, hi);

        merge(a, lo, mid, hi);
    }

    private static void merge(String[] a, int lo, int mid, int hi) {
        String[] temp = new String[hi - lo];
        int i = lo, j = mid, k = 0;

        while (i < mid && j < hi) {
            if (a[i].compareTo(a[j]) <= 0) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }

        while (i < mid) {
            temp[k++] = a[i++];
        }

        while (j < hi) {
            temp[k++] = a[j++];
        }

        for (int p = 0; p < temp.length; p++) {
            a[lo + p] = temp[p];
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();
        obj.nextLine();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextLine();
        }

        mergeSort(arr, 0, arr.length);

        for (String s : arr) {
            System.out.println(s);
        }

    }
}

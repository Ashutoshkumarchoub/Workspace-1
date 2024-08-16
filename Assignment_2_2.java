import java.util.Scanner;

public class Assignment_2_2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = scan.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }

        quickSort(ar, 0, n - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }

    // QuickSort method
    public static void quickSort(int[] ar, int low, int high) {
        if (low < high) {
            int pi = partition(ar, low, high);
            quickSort(ar, low, pi - 1);
            quickSort(ar, pi + 1, high);
        }
    }

    // Partition method
    public static int partition(int[] ar, int low, int high) {
        int pivot = ar[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (ar[j] < pivot) {
                i++;

                // Swap ar[i] and ar[j]
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }

        // Swap ar[i+1] and ar[high] (or pivot)
        int temp = ar[i + 1];
        ar[i + 1] = ar[high];
        ar[high] = temp;

        return i + 1;
    }
}

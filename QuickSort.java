/**
 * QuickSort
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] input = { 50, 23, 9, 18, 61, 32 };

        quickSort(input, 0, input.length-1);

        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }

    public static void quickSort(int[] input, int low, int high) {

        if(low >= high) return;

        int pi = partition(input, low, high);

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            System.out.print(" ");
        }
        System.out.println(" ");

        quickSort(input, low, pi-1);
        quickSort(input, pi+1, high);


    }

    public static int partition(int[] input, int low, int high) {
        int pivot = input[high];

        int i= low-1;
        for (int j = low; j < high; j++) {
            if(input[j] < pivot) {
                i++;
                swap(input, i, j);
            }
        }

        swap(input, i+1, high);
        return i+1;
    }

    public static void swap(int[] input, int low, int high) {
        int temp = input[low];
        input[low] = input[high];
        input[high] = temp;
    }


}
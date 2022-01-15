/**
 * bubbleSort
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] input = { 50, 23, 9, 18, 61, 32 };

        bubbleSort(input);

        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }

    public static void bubbleSort(int[] input) {

        for (int i = 0; i < input.length; i++) {
            for (int j = i+1; j < input.length; j++) {
                if(input[i] > input[j]) {
                    swap(input, i, j);
                }
            }
        }

    }

    public static void swap(int[] input, int low, int high) {
        int temp = input[low];
        input[low] = input[high];
        input[high] = temp;
    }


}
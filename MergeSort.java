/**
 * MergeSort
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] input = { 50, 23, 9, 18, 61, 32 };

        mergeSort(input);

        System.out.println("**** output ****");
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }

    private static void mergeSort(int[] input) {

        if(input.length == 1) return;

        int mid = input.length/2;

        int[] leftArr  = new int[mid];
        int[] rightArr = new int[input.length-mid];

        for (int i = 0; i < leftArr.length; i++) {
            leftArr[i] = input[i];
        }

        for (int i = 0; i < rightArr.length; i++) {
            rightArr[i] = input[mid+i];
        }

        mergeSort(leftArr);

        mergeSort(rightArr);

        combineSortedArrays(leftArr, rightArr, input);

    }

    private static void combineSortedArrays(int[] leftArr, int[] rightArr, int[] input) {
    
        int left=0, right=0, out=0;

        while (left < leftArr.length && right < rightArr.length) {
            if (leftArr[left] < rightArr[right]) {
                input[out] = leftArr[left];
                left++;
            } else {
                input[out] = rightArr[right];
                right++;
            }
            out++;
        }

        if (left < leftArr.length) {
            while (left < leftArr.length) {
                input[out++] = leftArr[left++];               
            }
        }

        if (right < rightArr.length) {
            while (right < rightArr.length) {
                input[out++] = rightArr[right++];               
            }
        }

    }
}
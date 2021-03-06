package Sorting.selectionSort;

public class SelectionSort {
    /**
     *
     * @param array
     */
    public static void selectionSort(int[] array){
        int n = array.length;
        for (int i = 0; i <n ; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[minIndex]){ // find the minimum element to the right of the minIndex..
                    minIndex = j;
                }

            }
            if (minIndex != i){ // find i is not the minimum index then swap..
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
    }

    /**
     * This method will print the array
     * @param array  is the array which is to be print.
     */
    public static void printArray(int[] array){
        int n = array.length;
        for (int i = 0; i <n; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }


}

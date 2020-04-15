package Sorting.bubbleSort;

public class BubbleSort {

    /**
     * This method wil sort the array according to BUBBLE SORT algorithm.
     * In each iteration we will get the largest element to the last of the array
     * we will not touch the last element anymore now
     * Now loop till last element-1 and check similarly.
     * Wgen we are left with the last  we need not do any comparision further and the array is sorted...
     * @param array the array to be sorted.
     */
    public void bubbleSort(int[] array){
        int n = array.length;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j]>array[j+1]){
                    int temp = array[i];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    /**
     * This method wil print the array...
     * @param array is the array to be printed
     */
    public  void printArray(int[] array){
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
    }

}

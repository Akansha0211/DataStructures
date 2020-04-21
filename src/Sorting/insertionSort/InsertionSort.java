package Sorting.insertionSort;

public class InsertionSort {
    /**
     * This method will sort the array of integers according to insertion sort
     * In insertion sort : we divide the array in two parts
     * Then we pick the first element from the unsorted array and put it in the correct position in the sorted array
     * Repeat till the unsorted array is not empty.
     * First element of the array is considered to be in the sorted array and unsorted array begins from 2nd position i.e index 1
     * @param array which is to be sorted...
     */

    public void insertionSort(int[]array) {
       int n = array.length;
        for (int i = 1; i < n; i++) {
            int currentNumber = array[i];
            int j = i;
            for (; j>0 && array[j-1]>currentNumber ; j--) {
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
            }
            array[j] = currentNumber;
        }
    }
    public void printArray(int[] A){
        int sizeOfArray = A.length;
        for (int i =0 ; i <sizeOfArray ; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }




}

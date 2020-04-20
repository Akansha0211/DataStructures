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
    public void insertionSort(int[]array){
        for (int i = 1; i <array.length; i++) {
            int currentNumber = array[i];
            int j = i;
            for (; array[j-1]>array[j] ; j--) {
                array[j] = array[j-1];
            }
            array[j] = currentNumber;
        }
    }
}

package Sorting.insertionSort;

public class InsertionSortMain {
    public static void main(String[] args) {
        InsertionSort sortedArray = new InsertionSort();
        int[] array = { 1,8,3,5,0,2,6,98,23,89};
        sortedArray.insertionSort(array);
        sortedArray.printArray(array);
    }
}

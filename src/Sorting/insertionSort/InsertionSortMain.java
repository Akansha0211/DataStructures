package Sorting.insertionSort;

public class InsertionSortMain {
    public static void main(String[] args) {
        InsertionSort sortedArray = new InsertionSort();
        int[] array = { 1,8,3,5,0,2,6,98,23,89};
        System.out.println("Unsorted Array");
        sortedArray.printArray(array);
        System.out.println("Unsorted Array");
        long start = System.nanoTime();
        sortedArray.insertionSort(array);
        long end = System.nanoTime();
        System.out.println("Time to execute this algorithm = "+(end - start)+" nanoseconds");
        sortedArray.printArray(array);
    }
}

package Sorting.selectionSort;

public class SelectionSortMain {
    public static void main(String[] args) {
        int[] array = { 12,34,20,13,45,39,54,81,20,12,20,10,5,6};

        System.out.println("Array to be sorted");
        SelectionSort.printArray(array);

        System.out.println("Sorted Array....");
        SelectionSort.selectionSort(array);
        SelectionSort.printArray(array);
    }
}

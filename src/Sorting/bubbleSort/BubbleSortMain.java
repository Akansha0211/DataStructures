package Sorting.bubbleSort;

public class BubbleSortMain {
    public static void main(String[] args) {
        BubbleSort  bubsort = new BubbleSort();
        int[] array ={17,23,10,14,2,1,8,0};
        System.out.println("Array to be sorted ");
        bubsort.printArray(array);

        System.out.println("Sorted Array...");
        bubsort.bubbleSort(array);
        bubsort.printArray(array);

    }
}

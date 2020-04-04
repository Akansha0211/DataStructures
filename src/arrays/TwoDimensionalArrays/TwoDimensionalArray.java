package arrays.TwoDimensionalArrays;

public class TwoDimensionalArray {
     int arr[][] = null;

     // Constructor
    public TwoDimensionalArray(int rows, int col){
        this.arr = new int[rows][col];
        for (rows = 0; rows < arr.length; rows++) {
            for (col = 0; col < arr[0].length ; col++) {
                arr[rows][col] = Integer.MIN_VALUE;
            }
        }
    }

}

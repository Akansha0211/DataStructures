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
    public void traverseArray(){
        try{
            for (int rows = 0; rows <arr.length ; rows++) {
                for (int col = 0; col < arr[0].length; col++) {
                    System.out.println(arr[rows][col]);
                }
            }
        }
        catch(Exception e){
            System.out.println("Array does not exist");
        }
    }

}

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

    /**
     * This method visits all the elements of the array
     */
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

    /**
     * This method wil insert a value at any particular index of the array
     * @param rows number of rows in the array
     * @param col number of columns in the array
     * @param value value which is to inserted in the array
     */
    public void insertValueInArray(int rows, int col, int value){
        try{
            if(arr[rows][col]==Integer.MIN_VALUE){
                arr[rows][col] = value;
            }
            else{
                System.out.println("This cell is already occupied");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to insert a value");
        }
    }

}

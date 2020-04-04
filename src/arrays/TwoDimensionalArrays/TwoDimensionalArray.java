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

    /**
     * This method will search a particular value in the array
     * @param value value which is to be searched
     */
    public void searchInArray(int value){
        for (int rows = 0; rows < arr.length; rows++) {
            for (int col = 0; col <arr[0].length ; col++) {
                if (arr[rows][col]== value){
                    System.out.println("value is found ! at row"+ rows+ " at column"+col);
                    return;
                }
            }
        }
        System.out.println("Value not found in Array");
    }

    /**
     * This method will access a value at any particular index
     * @param row row which is to be accessed
     * @param col column number which is to be accessed
     */
    public void accessArray(int row ,int col){
        try{
            System.out.println(arr[row][col]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Value at a particular which you wanted to access is not in the range of Array ");
            //e.printStackTrace();
        }
    }

}

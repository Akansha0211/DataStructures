package arrays;
//here we will write all the operations ior methods that can be performed on the array
public class SingleDimensionalArray {
    int[] arr = null;

    // for creating a blank array create a constructor ad pass size of array as an argument
    public SingleDimensionalArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i=0; i<arr.length;i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    /**
     * This method will print the elements in an Array in try block and will show an error message if an exception is found
     */
    public void traverseArray(){
        try{
            for (int i = 0; i <arr.length ; i++) {
                System.out.print(arr[i]+" ");
            }
        }
        catch (Exception e){
            System.out.println("Array no longer exists !");
        }
    }

    /**
     * This method will insert a value at a particular index
     * @param location at that particular location element needs to be added
     * @param valueToBeInserted the value which is to be inserted at a particular index
     */
    public void insert(int location , int valueToBeInserted){
        try{
            if (arr[location]== Integer.MIN_VALUE){
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted"+valueToBeInserted);
            }
            else {
                System.out.println("This cell is already occupied by another value"); // if we do not want to change the  already value  other than default value at a particular index
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array !");
            //e.printStackTrace()

        }
    }

    /**
     * This method will access the element at any given index
     * @param cellNumber index whose value is to be accessed
     */
    public void accessingCell(int cellNumber){
        try{
            System.out.println(arr[cellNumber]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array");
        }
    }
    public void deleteValueFromArray(int location){
        try{
            arr[location] = Integer.MIN_VALUE;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Cannot delete from this cell as this cell is out of bounds of the range of Array ");
        }
    }

    /**
     * THis method prints whether the  searched value is found or not
     * @param valueTobBeSearched  this the value which is searched in the array
     */
    public void searchInArray(int valueTobBeSearched){

            for (int i = 0; i < arr.length; i++) {
                if (arr[i]==valueTobBeSearched){
                    System.out.println("Value found !" + " at index "+ i);
                    return;
                }

        }
        System.out.println("Value to be searched is not found");

    }
}

package arrays.TwoDimensionalArrays;

public class TwoDimensionalArrayMain {
    public static void main(String[] args) {
        System.out.println("Creating a blank array");
        TwoDimensionalArray tda = new TwoDimensionalArray(5,5);
        tda.traverseArray();
        System.out.println("*****************************");
        tda.insertValueInArray(0,0,2);
        tda.insertValueInArray(1,3,5);
        tda.insertValueInArray(2,4,4);
        tda.insertValueInArray(3,5,5);
        tda.insertValueInArray(4,3,2);
        tda.insertValueInArray(5,5,10);
        tda.traverseArray();
        System.out.println("*****************************");
        System.out.println("Searching a particular value in array");
        tda.searchInArray(4);
        tda.searchInArray(20);

    }
}

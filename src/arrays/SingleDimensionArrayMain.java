package arrays;
// here we will call all the methods declared in SingleDimensionalArray
public class SingleDimensionArrayMain {
    public static void main(String[] args) {
        System.out.println("Creating a block array of size 10");
        SingleDimensionalArray sda = new SingleDimensionalArray(10);

        System.out.println("Printing the Array");
        sda.traverseArray();

        System.out.println("Inserting the value in the array...");
        sda.insert(1,0);
        sda.insert(1,10);
        sda.insert(2,20);
        sda.insert(3,30);
        sda.insert(4,40);
        sda.insert(5,50);
        sda.insert(6,60);
        sda.insert(7,70);
        sda.insert(8,80);
        sda.insert(1,100);
        sda.insert(12,120);

        System.out.println("Accessing the cell number 1");
        sda.accessingCell(1);

    }
}

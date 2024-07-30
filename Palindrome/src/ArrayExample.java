import java.util.Arrays;

public class ArrayExample {
    private int[] theArray;
    private int itemsInArray;
    private int arraySize;

    // Constructor to initialize the array and other variables
    public ArrayExample(int size) {
        this.arraySize = size;
        theArray = new int[arraySize];
        System.out.println("Array of size " + arraySize + " created, the array is : " + Arrays.toString(theArray));
        itemsInArray = 0;
    }

    // O(1) operation to add an item to the array
    public void addItemToArray(int newItem) {
        if (itemsInArray < arraySize) {
            theArray[itemsInArray++] = newItem;
            System.out.println("Item " + newItem + " added to the array.");
        } else {
            System.out.println("Array is full. Cannot add item " + newItem);
        }
    }

    // O(n) operation to generate a random array
    public void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int) (Math.random() * 1000) + 10;
        }
        itemsInArray = arraySize;
    }

    public static void main(String[] args) {
        ArrayExample example = new ArrayExample(10000);
        example.addItemToArray(500);
        example.generateRandomArray();
        NewClass obj = new NewClass(10);
        obj.Print();
        ArrayExample.Linear linearSearch = example.new Linear(10000, example.theArray, example.arraySize);
        linearSearch.linear(100);
        ArrayExample.Linear linearSearch1 = example.new Linear(100000, example.theArray, example.arraySize);
        linearSearch1.linear(500);
    }

    public static class NewClass{
        private double[] message;

        public NewClass(int message){
            this.message = new double[message] ;
        }

        public void Print(){
            System.out.println("Message: " + Arrays.toString(message));
        }
    }

    public class Linear{
        private int arraySize;
        private int[] theArray;
        private long startTime;
        private long endTime;
        String indexWithValue = "";
        boolean valueFound = false;

        public Linear(int value, int[] array, int size) {
            this.arraySize = size;
            this.theArray = array;
        }

        public void linear(int value) {
            startTime = System.currentTimeMillis();
            for (int i = 0; i < arraySize; i++) {
                if (theArray[i] == value) {
                    valueFound = true;
                    indexWithValue += i + " ";
                }
            }
            System.out.println("Value found: " + valueFound);
            endTime = System.currentTimeMillis();
            System.out.println("Linear Search took " + (endTime - startTime) + " milliseconds.");
        }
    }
}
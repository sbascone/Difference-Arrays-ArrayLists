import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        // Example using Array (fixed size)
        int[] myArray = new int[3]; // I can only put 3 numbers here
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;

        System.out.println("Array values:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        // Example using ArrayList (size can grow)
        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(10); // I can keep adding numbers
        myArrayList.add(20);
        myArrayList.add(30);

        System.out.println("ArrayList values:");
        for (int number : myArrayList) {
            System.out.println(number);
        }

        // Notes:
        // Array = size is fixed, not easy to change
        // ArrayList = size can grow, easier to use
    }
}

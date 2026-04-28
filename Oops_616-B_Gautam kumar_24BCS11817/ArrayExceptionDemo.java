public class ArrayExceptionDemo {
    public static void main(String[] args) {
        
        int arr[] = {10, 20, 30, 40, 50};

        try {
            System.out.println("Accessing element: " + arr[10]); // invalid index
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught!");
            System.out.println("Invalid index accessed.");
        }

        System.out.println("Program continues...");
    }
}
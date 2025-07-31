import java.util.Scanner;

class Linear {
    public static void main(String args[]) {
        int array[], i, size, f = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array");
        size = sc.nextInt();
        array = new int[size];

        System.out.println("Enter the " + size + " elements of array");
        for (i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Elements of array:");
        for (i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nEnter the key to search in an array:");
        int key = sc.nextInt();

        for (i = 0; i < size; i++) {
            if (key == array[i]) {
                f = 1;
                System.out.println("Element found at index: " + i);
                break;
            }
        }

        if (f == 0) {
            System.out.println("Element not found");
        }
    }
}

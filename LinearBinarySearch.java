import java.util.Scanner;
import java.util.Arrays;

public class LinearBinarySearch {
    public static void main(String[] args) {

        int key,size;
        int f=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of Customer ID's: ");
        size = sc.nextInt();
        int a[] = new int[size];

        System.out.println("Enter the " +size+ " Customer ID's: ");

        for(int i=0; i<size ; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("\nTo find the Customer ID:");
        System.out.println("Choice 1 : Linear Search");
        System.out.println("Choice 2 : Binary Search");

        System.out.print("\nEnter Your choice: ");
        int choice = sc.nextInt();


        switch (choice){
            case 1 : System.out.println("\nEnter the Customer ID to search:");
                key = sc.nextInt();

                for ( int i = 0; i < size; i++) {
                    if (key == a[i]) {
                        f = 1;
                        System.out.println("Element found at index: " + i);
                        break;
                    }
                }

                if (f == 0) {
                    System.out.println("Element not found");
                }
                break;


            case 2 : Arrays.sort(a);

                System.out.print("Enter the Customer ID to search: ");
                key = sc.nextInt();

                int l=0, h=size-l;

                while(l<=h) {
                    int mid = (l + h) / 2;

                    if (key == a[mid]) {
                        System.out.println("Key found at Index: " + mid);
                        f = 1;
                        break;
                    } else if (key > a[mid]) {
                        l = mid + 1;
                    } else {
                        h = mid - 1;
                    }

                    if (f == 0) {
                        System.out.println("Key not found");
                        break;
                    }
                }
        }
    }
}



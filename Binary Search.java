import java.util.Scanner;

public class BinarySearch {
        public static void main(String args[]){
                Scanner s = new Scanner(System.in);
                int l,h,key,mid;
                int f=0;

                System.out.print("Enter the size of array: ");
                int size = s.nextInt();
                int a[] = new int[size];

                System.out.println("Enter the " +size+ " array elements");

                for(int i=0; i<size ; i++){
                a[i] = s.nextInt();
      }

      System.out.print("Enter the key to search: ");
      key = s.nextInt();

      l=0; h=size-l;

      while(l<=h){
            mid=(l+h)/2;

            if(key==a[mid]){
                    System.out.println("Key found at Index: " +mid);
                    f=1;
                    break;
            }
            else if(key>a[mid]) {
                    l = mid + 1;
            }
            else{
                    h = mid - 1;
            }
      }
      if (f==0)
      {
          System.out.println("Key not found");
      }
    }
} 


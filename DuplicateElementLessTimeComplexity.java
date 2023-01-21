import java.sql.SQLOutput;
import java.util.Scanner;

public class DuplicateElementLessTimeComplexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter Array elements: ");
        // for loop to take array element from user
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter count size");
        int countSize = sc.nextInt();
        // calling and storing findDuplicate function in result variable
        System.out.println("Duplicate elements : ");
       findDuplicate(array, countSize);
    }

    public static void findDuplicate(int[] arr, int countSize) {

        int[] count = new int[countSize];
        int size = arr.length;
//        System.out.println("Duplicate element: " );
        for (int i = 0; i < size; i++) {
            count[arr[i]]++;
            if (count[arr[i]] == 2) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

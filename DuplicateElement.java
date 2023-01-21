// Find duplicate element in an array

import java.util.Scanner;

public class DuplicateElement {
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
        // calling and storing findDuplicate function in result variable
       int result= findDuplicate(array);

        System.out.println(result);
    }
//function to find duplicate element
    public static int findDuplicate(int[] arr) {
        // storing length of an array in size variable
        int size = arr.length;
    // outer loop to traverse array elements from index 0 to n-1
        for (int i = 0; i <size ; i++) {
            // inner loop starting from index 1 to n-1
            for (int j = i+1; j < size ; j++) {
                // comparing array element of previous index with the immediate next element
                if(arr[i] == arr[j]) {
                    // return the element once if condition is true
                    return arr[i];
                }
            }
        }
        // return -1 if duplicate element not found
        return -1;
    }
}

import java.util.*;

class ArrayMinMax {
    public static void main(String args[]) {
        int i, sum = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Array elements: ");
        n = sc.nextInt();
        int arr[] = new int[n];
		System.out.println("Accepting array: ");
        for (i = 0; i < n; i++) { 
            arr[i] = sc.nextInt();
        }

        int max_element = arr[0], min_element = arr[0];
		for (i = 0; i < n; i++) {
            if (arr[i] > max_element) { 
                max_element = arr[i];
            }

            if (arr[i] < min_element) { 
                min_element = arr[i];
            }
        }
        System.out.println("\n Maximum Number: " + max_element);
        System.out.println("\n Minimum Number: " + min_element);
    }
}
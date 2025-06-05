import java.util.*;

class reverseArray1 {
    public static void main(String[] args) {
        int[] arr={3,1,7,5,10};
        int n=arr.length;
        for(int i=0; i<n/2; i++) {
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
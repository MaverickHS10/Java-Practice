import java.util.*;

class reverseArray2 {
    public static void main(String args[]) {
        int[] arr={1,6,3,8,4,10};
        int[] revArray=new int[arr.length];

        for(int i=0; i<arr.length; i++) {
            revArray[i]=arr[arr.length-i-1];
        }
        System.out.println("Reversed array: "+ Arrays.toString(revArray));
    }
}
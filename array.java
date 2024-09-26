import java.util.*;
public class array {

    public static void main(String[] args) {
        int[] arr ={1,2,9,4,3,6};


        // clone the arr to arr1
        int[] arr1 = arr.clone();

       

        System.out.println("array1");
        for (int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("array2");
        for (int i=0 ; i<arr.length ; i++){
            System.out.print(arr1[i]+ " ");
        }

        // sort an array
       
        Arrays.sort(arr);


        

    }
}
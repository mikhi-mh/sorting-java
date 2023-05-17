package bubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world, I am from BubbleSort");
        // Bubble Sort
        // Sinking Sort
        // Exchange Sort
        // in-place sorting techniques
        //  O(N^2)
        // stable sorting technique

        int[] arr = {-5,0,3,1,9,8,6};
        System.out.println(Arrays.toString(arr));

        System.out.println("this is not sorted");

        myBubbleSort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println("this is sorted");
    }

    static void myBubbleSort(int[] arr) {

        boolean swapped;
        for (int i = 0; i < arr.length-1; i++) {
            swapped = false;
            for (int j = 1; j < arr.length-i; j++) {

                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }

        }
    }
}
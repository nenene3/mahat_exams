package magen2;

import java.util.Random;

public class ex4 {
    public static void main(String[] args) {
        int[] arr=new int[21];
        boolean bad;
        Random random = new Random();
        for(int i=0;i<21;i++){
            bad=true;
            while(bad){
                bad=false;
                int num=random.nextInt(90)+10;
                for(int j=0;j< arr.length;j++){
                    if(arr[j]==0){
                        arr[j]=num;
                        break;
                    }
                    if (arr[j] == num) {
                        bad = true;
                        break;
                    }
                }
            }

        }
        bubbleSort(arr, arr.length);
        for(int i : arr)
            System.out.print(i+" ");
        System.out.println();
        System.out.println(arr[(arr.length+1)/2]);
    }
    static void bubbleSort(int[] arr, int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (!swapped)
                break;
        }
    }
}

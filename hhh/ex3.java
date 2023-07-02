package hhh;

import java.util.Random;

public class ex3 {
    public static void main(String[] args) {
//    int[] arr = {1,1,2,2,3,3,5,5};
//        System.out.println(isSetOfFriends(arr));
        int arr[]= new int[20];
        Random random = new Random();
        do{
            for(int i=0;i< arr.length;i++){
                arr[i]= random.nextInt(90)+10;
            }
        }while(!isSetOfFriends(arr));
        for(int i : arr)
            System.out.print(i+" ");
        System.out.println(isSetOfFriends(arr));

    }

    public static boolean isSetOfFriends(int[] arr){
        int counter=0;
        for(int i=0;i< arr.length;i++){
            counter=0;
            for(int j=0;j< arr.length;j++){
                if(arr[i]==arr[j])
                    counter++;
            }
            if(counter!=2)
                return false;
        }


        return true;
    }


}

package magen2;

public class ex8 {
    public static void main(String[] args) {

        int[] arr={1,2,3,4};
        int[] result = sumArray(arr);
        for(int i : result)
            System.out.print(i+" ");
    }
    public static int[] sumArray(int[] arr){
        int[] ret =  new int[arr.length / 2 +arr.length%2];

        int index=0;
        for(int i=0;i< arr.length-1;i+=2)
            ret[index++]=arr[i]+arr[i+1];

        if(arr.length%2==1)
            ret[ret.length-1]=arr[arr.length-1];

        return ret;
    }
}

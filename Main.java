import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();

        while(true)
            System.out.println(r.nextInt(10,12));

//        int[] arr={65,23,65,43,23,87,65};
//        System.out.println(counter(arr, arr.length,100));
    }
    public static int counter(int[] arr, int num){
        return counter( arr, arr.length, num);
    }

    public static int counter(int[] arr,int length,int num){
        if(length==0)
            return 0;
        if(num==arr[length-1])
            return counter(arr,length-1,num)+1;

        return  counter(arr,length-1,num);
    }
}
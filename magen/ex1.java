package magen;

public class ex1 {
    public static void main(String[] args) {
        int[] arr = {4,1,2,4,345,-123123,453,-3452436,21,4634,3453,-3242,-34621,-353,-634263,2,1234,345634,32,-1,-54,-345,-64,0};

        int round=3;
        clean(arr,4);
    }
    public static void clean(int[] arr,int round){
        int start=0;
        int end=arr.length-1-1;
        while(start!=end){

            int tmp;
            while(arr[start]<=round &&start!=end)
                start++;
            while(arr[end]>=round && end!=start)
                end--;

            if(start!=end){
                tmp=arr[end];
                arr[end]=arr[start];
                arr[start]=tmp;

            }

        }
        arr[arr.length-1]=arr[start];
        arr[end]=round;
        System.out.println(round);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");


    }
}

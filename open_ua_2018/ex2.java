package open_ua_2018;

public class ex2 {
    public static void main(String[] args) {
        int[] arr ={5,1,1,-1};
        System.out.println(equalPartition(arr));

    }
    public static boolean equalPartition(int[] arr){
        int sumEnd =0;
        int sumStart=0;
        for(int i=1;i< arr.length;i++){
            sumEnd+=arr[i];
        }
        for(int i=0;i<arr.length-1;i++){
            sumStart+=arr[i];
            System.out.println(sumEnd+"=="+sumStart);
            if(sumStart==sumEnd)
                return true;
            sumEnd-=arr[i+1];
        }
        return false;
    }
}

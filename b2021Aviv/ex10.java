package b2021Aviv;

public class ex10 {
    public static void main(String[] args) {

        int[] arr={1,12,123,213,6342};
        int[] arr1={1,12,123,213,6342};
        System.out.println(ex2(arr,arr1));
    }
    public static int ex(int num){
        if(num<0)
            num*=-1;
        int count=0;
        while(num!=0){
            count+=num%10;
            num/=10;
        }
        return count;
    }
    public static boolean ex1(int[] arr){
        for(int i=0;i< arr.length;i++)
            for(int j=0;j< arr.length;j++){
                if(j==i)
                    continue;
                if(ex(arr[i])==ex(arr[j]))
                    return false;

            }
        return true;
    }
    public static boolean ex2(int[] arr1,int[] arr) {
        for(int i=0;i< arr.length;i++){
            int j=0;
            for(;j< arr1.length;j++)
                if(ex(arr[i])==ex(arr1[j]))
                    break;

            if(j== arr1.length)
                return false;
        }
        return true;
    }
}

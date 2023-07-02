package open_ua_2018b;

public class ex2 {
    public static void main(String[] args) {
        int[] arr ={3,5,9,2,4,8};
        System.out.println(diffValues(arr,9));
    }
    public static boolean diffValues (int[] a , int num){
        int[] counter= new int[num];
        for(int i=0;i< a.length;i++){
            if (a[i]>num)
                return false;
            if (counter[a[i]-1]>0) {
                return false;
            }
            counter[a[i]-1]++;
        }
        for(int i : counter)
            if(i >=2)
                return false;

        return true;
    }
}



// 1,2,3,4,5,6,7,8,9,10
//,11,12,13,14,15,16,17
// 18,19,20,21,22,23,24
package open_ua_2018_90;

public class ex2 {
    public static void main(String[] args) {
        int[] arr ={3,6,10,5,9,7};
        System.out.println(check1(arr,8));
    }
    public static boolean check1(int[] arr ,int num){
        for(int i=0;i< arr.length;i++)
            for(int j=0;j<arr.length;j++){
                if(i==j)
                    continue;
                if(arr[i]-arr[j]==num)
                    return true;
            }
        //
        return false;
    }
    public static boolean check2(int[] arr ,int num){
        boolean isFound=true;

        for(int i=0;i< arr.length;i++)
            for(int j=0;j<arr.length;j++){
                if(i==j)
                    continue;
                if(arr[i]-arr[j]==num)

                    return true;
            }

        return false;

    }
}
//boolean found
//4,4  //0
//0,1 1,0
//0,1 3,6
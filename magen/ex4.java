package magen;

public class ex4 {
    public static void main(String[] args) {
        int[][] arr={{1,1,1,1},
                     {1,1,1,1}
                    ,{1,3,1,1}
                    ,{1,3,1,1}
                    ,{1,1,1,1}
                    ,{1,1,1,1}};
        System.out.println(of(arr));
    }


    public static boolean of(int[][] arr){
        int num=0;
        if(arr.length%2==1 )
            return false;
        for(int i=0;i< arr.length/2;i++){
            for(int j=0;j< arr[j].length;j++)
                num+=arr[i][j];

        }
        for(int i= arr.length/2;i< arr.length;i++){
            for(int j=0;j< arr[j].length;j++)
                num-=arr[i][j];

        }


        System.out.println(num);
        return num==0;
    }
}


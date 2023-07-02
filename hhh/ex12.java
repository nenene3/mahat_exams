package hhh;

public class ex12 {
    public static void main(String[] args) {

        int[][] arr={{43,43,43,2}
                    ,{43,43,43,2},
                     {43,43,43,2},
                     {43,43,43,2}};
        System.out.println(arrCheck(arr));
    }



    public static boolean arrCheck(int[][] arr){

        for(int i=0;i< arr[0].length;i++){
            for(int j=0;j< arr.length;j++){
                if(!digit(arr[j][i]))
                    break;
                if(j== arr.length-1)
                    return true;
            }
        }
        return false;
    }
    public static boolean digit(int num){
        int tmp=0;
        int check=num%10;
        while(num!=0){
            tmp=num;
            num/=10;
        }
        return check%tmp==0;
    }
}

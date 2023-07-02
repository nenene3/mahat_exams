package magen;

public class ex7 {
    public static void main(String[] args) {

        int[][] arr= {{1,1,1,1,1},
                      {1,2,2,2,2},
                      {1,2,3,3,3},
                      {1,2,3,4,4},
                      {1,2,3,4,5}};


        System.out.println(isCorner(arr));

    }
    public static boolean isCorner(int[][] arr){
        if(arr.length!=arr[0].length)
            return false;
        for(int i=0;i< arr.length;i++){
            for(int j=i;j< arr.length;j++){
                if(arr[i][j]!=i+1 || arr[j][i]!=i+1)
                    return false;
            }
        }





        return true;
    }
}

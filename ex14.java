public class ex14 {
    public static void main(String[] args) {

        int[][] arr ={{1,1,2,2,6},
                      {1,1,2,3,3},
                      {1,1,2,3,3}};


        System.out.println(ketem(arr,3));
    }



    public static boolean ketem(int[][] arr , int value){

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j< arr[i].length-1;j++){
                if(arr[i][j]==value && arr[i][j]== arr[i+1][j] && arr[i][j] == arr[i+1][j+1] && arr[i][j]== arr[i][j+1])
                    return true;
            }
        }
        return false;
    }
    public static boolean ketem(int[][] arr){
        int counter=0;
        for(int i=0;i< 10;i++){
            if(ketem(arr,i))      //true
                counter++;
            if(counter==3)
                return true;
        }
        return false;
    }
}

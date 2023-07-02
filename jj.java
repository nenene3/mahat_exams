public class jj {
    public static void main(String[] args) {


        int[][] a = {{0, 0, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1}};
        System.out.println(isMukaf2(a,1,3));


    }

    public static boolean isMukaf2(int[][] arr, int i, int j){


        if( arr[0].length<=j || arr.length <= i || arr[i][j]==0)
            return false;
        int counter=0;
        for(int index=i;index< arr.length;index++){
            if(arr[index][j]==0)
                break;
            counter++;
        }
        for(int index=i;index>=0;index--){
            if(arr[index][j]==0)
                break;
            counter++;
        }

        int counter2=0;
        for(int index=j;index< arr[i].length;index++){
            if(arr[i][index]==0)
                break;
            counter2++;
        }
        for(int index=j;index>=0;index--){
            if(arr[i][index]==0)
                break;
            counter2++;
        }
        return counter2==counter;
    }






















    public static boolean isMukaf(int[][] arr, int i, int j) {
        int counter = 0;
        int max = 0;
        int max2=0;
//        for (int index = 0; index < arr[0].length; index++) {
//            if (arr[i][index] == 1) {
//                counter++;
//            } else {
//                counter = 0;
//            }
//            if (counter > max)
//                max=counter;
//
//        }
//        counter=0;
//        for (int index = 0; index < arr.length; index++) {
////            counter -= arr[index][j];
//            if (arr[index][j] == 1) {
//                counter++;
//            } else {
//                counter = 0;
//            }
//            if (counter > max2)
//                max2=counter;
//        }


        return max == max2;
    }
}

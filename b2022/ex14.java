package b2022;

public class ex14 {
    public static void main(String[] args) {

    }

    public static boolean www(int[] arr,int[][] mat){
        if(arr.length!=mat[0].length)
            return false;
        int[] counter = new int[mat.length];
        for(int i=0;i< arr.length;i++)
            for(int j=0;j< arr.length;j++)
                if(mat[i][j]==arr[i])
                    counter[j]++;


        for(int i=0;i<counter.length;i++)
            if(counter[i]!=i)
                return false;
        return true;
    }

    public static boolean www1(int[] arr,int[][] mat){
        if(arr.length!=mat[0].length)
            return false;
        int counter=0;
        for(int i=0;i< arr.length;i++) {
            for (int j = 0; j < arr.length; j++)
                if(mat[j][i]==arr[i])
                    counter++;
            if(counter!=i)
                return false;
        }





                return true;
    }
}

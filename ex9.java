public class ex9 {
    public static void main(String[] args) {

        int[] check={-5,-4,-3,-2,-1,0,1,2,3,4,5,6};
//        int[] arr = {23, 30, 24, 29, 25, 28, 26, 31, 27};
        System.out.println(isORDER(check));
//        int[] arr = {-23, -30, -24, -29, -25, -28, -26, -31, -27};


    }


    public static boolean full(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
        }


        // min = -10
        // max = 5
//
        int expLength = Math.abs(max - min) + 1;



        System.out.println("min " + min);
        System.out.println("max " + max);
        System.out.println(expLength);
        System.out.println(arr.length);


        if (expLength != arr.length)
            return false;


        int[] counter = new int[arr.length];
        for (int i=0;i< arr.length;i++)
            counter[arr[i]-min]++;

        for(int i=0;i<counter.length;i++)
            if(counter[i]>1)
                return false;
        
        return true;
    }
    public static boolean isORDER(int[] arr){
        int min=arr[0];
        for(int i=0;i< arr.length;i++)
            if(arr[i]!=i+min)
                return false;
        return true;
        }
}

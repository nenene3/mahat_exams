public class ex4 {
    public static void main(String[] args) {
        int[] arr= {1,9,2,8,4,7,7,4,12};
        System.out.println(crossed(arr));


    }
    public static boolean crossed(int[] arr){
        for(int i=0;i< arr.length-2;i++)
            if(i%2==0 && arr[i] > arr[i + 2])
                return false;
            else
                if(i%2!=0 && arr[i]<arr[i+2])
                    return false;
        return true;
    }

    public static int tiny(int[] arr){
        if(arr[0]<arr[arr.length- arr.length%2-1])
            return arr[0];


        return arr[arr.length-2];

    }
}

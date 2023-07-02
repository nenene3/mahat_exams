package b2021Aviv;

public class ex9 {
    public static void main(String[] args) {
        int[] arr= {3,2,2,2,5,6,6,1,3,3,3,3,1,2};

        System.out.println(num(2,arr));
    }
    public static int num(int num,int[] arr){
        int counter=0;
        int current=1;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]==arr[i+1])
                current++;
            else {
                if(num<=current)
                    counter++;
                current=1;
            }
        }





        return counter;
    }
}

package b2022;

public class ex10 {
    public static void main(String[] args) {
        int s=123;
        int q=183;
        int[] arr={123,153,1234,4536,2341,436,193};

        gold(arr);

    }
    public static boolean gold(int num1,int num2){

        if(num1%10!=num2%10)
            return false;

        while(num1>=10 && num2>=10){
            num1/=10;
            num2/=10;

        }

        return num1==num2;
    }
    public static void gold(int[] arr){


        for(int i=0;i< arr.length;i++)
            for(int j=i+1;j< arr.length;j++)
                if(gold(arr[i],arr[j]))
                    System.out.println(arr[i] +" "+arr[j]);
    }


}

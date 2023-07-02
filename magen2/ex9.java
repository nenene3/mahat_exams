package magen2;
import java.lang.Math;


public class ex9 {
    public static void main(String[] args) {

        System.out.println(rec(-123,-6));
    }

    public  static boolean fun1(int num,int sum) {
        sum=Math.abs(sum);
        num=Math.abs(num);
        if(num==0) {
            return sum==num ;
        }
        return sum-(num%10)>=0 && fun1(num/10,sum-num%10);
    }



    public static boolean rec(int num,int digit){

        return digit == help(num);
    }


    public static int help(int num){
        if(num==0)
            return 0;
        return help(num/10)+num%10;
    }
    public static boolean help1(int find,int num,int sum){
        if(num==0){
            System.out.println(sum);
            return find==sum;
        }
        return help1(find,num/10,sum+=num%10);
    }


}

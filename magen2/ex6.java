package magen2;

import java.util.Random;

public class ex6 {
    public static void main(String[] args) {
        Random random = new Random();

        int num2,num1;
        do {
            num1 = random.nextInt(900000) + 100000;
            num2 = random.nextInt(900000) + 100000;
        }while (num1>num2 );
        System.out.println(num1);
        System.out.println(num2);
        for(int i=num1+1;i<num2;i++){
            if(sum(i))
                System.out.println(i);
        }
    }
    public static boolean sum(int num){
        int tmp=num;
        int sum=0;
        while(tmp!=0){
            sum+=tmp%10;
            tmp/=10;
        }
        return num%sum==0;
    }
}

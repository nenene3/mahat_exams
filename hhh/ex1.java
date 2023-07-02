package hhh;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num=0;
        int sum=0;
        int sumAll=0;
        int count=0;
        System.out.println("enter number\nif you want to stop enter 500");
        num= s.nextInt();
        while(num!=500){
            count++;
            sumAll+=num;
            if(num%2==1){
                sum=0;
                while(num!=0){
                    sum+=num%10;
                    num/=10;
                }
                System.out.println(sum);
            }
            num= s.nextInt();
        }
        System.out.printf("the avg is %d",sumAll/count);

    }
}

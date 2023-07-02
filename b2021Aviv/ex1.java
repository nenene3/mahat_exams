package b2021Aviv;

import java.util.Scanner;
import java.util.Random;

public class ex1 {
    public static void main(String[] args) {
        int sum=0;
        int enter;
        int digits=0;
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        for(int i=0;i<39;i++){
            enter=r.nextInt(900)+100;
            sum+=enter;
            if(enter%2==0){
                for(int j=0;j<3;j++){
                    digits+=enter%10;
                    enter/=10;
                }
                System.out.println(digits);
                digits=0;
            }
        }
        System.out.println(sum/39);
    }
}

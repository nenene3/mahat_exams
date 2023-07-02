package magen2;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        int up;
        int down;
        Scanner s = new Scanner(System.in);
        System.out.println("enter up");
        up= s.nextInt();
        System.out.println("enter down");
        down= s.nextInt();
        int tmpUp=up;
        int tmpDown=down;
        tmpUp/=10;
        tmpDown%=10;
        if(tmpDown*up==down){
            System.out.println(up+"\n"+"--\n"+down);
            System.out.println(tmpUp+"\n"+"--\n"+tmpDown);
        }

    }
}

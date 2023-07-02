package hhh;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        String aaa;
        int counter=0;
        Scanner s = new Scanner(System.in);
        for(int i=0;i<23;i++){
            aaa= s.next();
            if(!aaa.contains("AA") && aaa.indexOf('A')!=aaa.lastIndexOf('A'))
                counter++;
            System.out.println(counter);
        }
        System.out.println(counter);
    }
}

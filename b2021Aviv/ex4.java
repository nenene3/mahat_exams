package b2021Aviv;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        int counter=0;
        String s;
        Scanner scanner= new Scanner(System.in);
        do{
            s=scanner.next();
            if(check(s))
                break;
            counter++;
        }while(true);
        System.out.println(counter);
    }
    public static boolean check(String s){
        if (!((s.charAt(0)>='A' && s.charAt(0)<='Z') && (s.charAt(s.length()-1)>='0' && s.charAt(s.length()-1)<='9') && s.length()>=8))
            return false;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1))
                return false;
        }

        return true;
    }
}

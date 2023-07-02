package b2022;

import java.security.PublicKey;

public class ex9 {
    public static void main(String[] args) {
        String a="Zz";

        System.out.println(pretty(a));


    }
    public static boolean pretty(String a){
        if(a.length()%2!=0)
            return false;
        int[] lower= new int[26];
        for(int i=0;i<a.length() ;i++){
            char currChar = a.charAt(i);
            if(!(currChar >='a' && currChar <='z')
                    && !(currChar >='A' && currChar <='Z'))
                return false;
            if(currChar >='a' && currChar <='z')
                lower[currChar -'a']--;
            if(currChar >='A' && currChar <='Z')
                lower[currChar -'A']++;

        }

        for(int i=0;i< lower.length;i++)
            if(lower[i]!=0)
                return false;

        return true;


    }
}

package magen2;

public class ex10 {
    public static void main(String[] args) {

//        System.out.println(myStrCat("gilweiss","gilweiss"));

        String s1="gil_weiss";
    }
    public static String myStrCat(String s1,String s2){
        for(int i =0;i<s1.length();i++)
            System.out.println(s1.substring(i));
        for(int i =0;i<s1.length();i++)
            if(s2.startsWith(s1.substring(i)))
                return s1.substring(0,i)+s2;
        return s1+s2;
    }
}

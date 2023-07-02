package hhh;

public class ex9 {
    public static void main(String[] args) {
        String a= "123412341234";
        //         asdasdasd
        System.out.println(is(a,3));
    }
    public static boolean is(String s,int k){
        String piece=s.substring(0,s.length()/k);
        String as="";
        for(int i=0;i<k;i++){
            as+=piece;

        }
        System.out.printf("%s == %s ? \n",s,as);
        return as.equals(s);
    }
}

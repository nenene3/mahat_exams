import static java.lang.Character.isUpperCase;

public class ex1 {
    public static void main(String[] args) {

    }
    public static boolean aaaaa(String str){
        for(int i=0;i<str.length()-1;i++)
            if(str.charAt(i)==str.charAt(i+1))
                return false;
        return str.charAt(0)>='A' && str.charAt(0)<='Z' && str.charAt(str.length()-1)>='0' && str.charAt(str.length()-1)<='9' && str.length()>=8;
    }
}

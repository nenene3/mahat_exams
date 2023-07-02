package b2022a;

public class ex9 {
    public static void main(String[] args) {

        System.out.println(spe(""));



    }
    public static boolean spe(String str){
        int[] c=new int[26];
        if(str.charAt(0)>='a' && str.charAt(0)<='z') {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) <= 'a' && str.charAt(i) >= 'z')
                    return false;
                c[str.charAt(i) - 'a']++;
            }
            for(int i=0;i<c.length;i++)
                if(c[i]%2==1)
                    return false;

        } else if (str.charAt(0)>='A' && str.charAt(0)<='Z') {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) <= 'A' && str.charAt(i) >= 'Z')
                    return false;
                c[str.charAt(i) - 'A']++;
            }
            for(int i=0;i<c.length;i++)
                if(c[i]%2==1)
                    return false;

        }
        else
            return false;


        return true;
    }
}

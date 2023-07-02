public class check {
    public static void main(String[] args) {



    }
    public static boolean what (String s1, String s2)
    {
        if(s1.length() != s2.length())
            return false;
        if(s1.length() == 0)
            return true;
        int place = s2.indexOf(s1.charAt(0));
        if(place < 0)
            return false;
        else
        {
            String a = s2.substring(0, place);
            String b = s2.substring(place+1);
            String c = a.concat(b);
            return what(s1.substring(1),c);
        }
    }
    public static boolean what1(String s1, String s2){
        if(s1.length()!=s2.length())
            return false;
        int[] chars= new int[256];
        for(int i=0;i<s1.length();i++){
            chars[s1.charAt(i)]++;
            chars[s2.charAt(i)]--;
        }
        for(int i=0;i<chars.length;i++)
            if(chars[i]==0)
                return false;

        return true;
    }
}

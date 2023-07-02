public class ex91 {
    public static void main(String[] args) {
        String a = "";
        System.out.println(special(a));


    }

    public static boolean special(String str) {
        if(str.length()==0)
            return false;
        int[] chars = new int[26];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                //chars['c'-'a']=3;
                if (chars[str.charAt(i) - 'a'] == 0) {
                    chars[str.charAt(i) - 'a']++;
                } else {
                    return false;
                }
            } else return false;
        }
        return true;
    }
}

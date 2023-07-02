public class sasaa {
    public static void main(String[] args) {

        String a ="6";
        System.out.println(divide(a,4));


    }
    public static boolean divide(String a , int digit){
        String s="";
        if(digit>a.length())
            return false;
        for(int i=0;i<digit;i++){
            s+=a.substring(0,a.length()/digit);
        }
        System.out.printf("%s == %s ?",s,a);

        return s.equals(a);
    }
}

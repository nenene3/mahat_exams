public class recru {
    public static void main(String[] args) {


        print(4);
    }
    public static void print(int len){
        helper(0,len);
    }
    public static void helper(int num,int len ){
        if(num==len*len) {
            return;
        }
        if(num%len==0) {
            System.out.println();
        }
        System.out.print("*");
        helper(num+1,len);
    }
}

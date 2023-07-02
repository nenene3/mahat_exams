public class rec {





    public static void main(String[] args) {


        System.out.println(ex4("12342g34123"));

    }
    public static void ex3(int num){
        if(num==0)
            return;

        ex3(num/2);
        System.out.print(num%2);
        }

        public static boolean ex4(String str){

        if(str.length()==0)
            return true;

        return(str.charAt(0)>='0' &&str.charAt(0)<='9') && ex4(str.substring(1));



        }
        public static void ex5(int num){
        if(num==0)
            return;
        ex5(num/16);
            if(num%16>=10)
                System.out.print((char)((num%16-10)+'A'));
            else
                System.out.print(num%16);

        }
        public static int ex6(int num){

        if(num==0)
            return 0;
        if(num==1)
            return 1;
        return ex6(num-1)+ex6(num-2);
        }

    }



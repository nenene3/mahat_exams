package magen;

public class ex9 {
    public static void main(String[] args) {

        String DR="123456789";
        String str="milk 2.43 4899 , bread 6.71 3 , Eggs 1.77 30";


        dd(str);


    }

    public static void dd(String str){
        float f;
        int num;
        int counter=0;
        String add="";
        float counter1=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==',')
                counter=i+1;
            if(str.charAt(i)>='0' && str.charAt(i)<='9') {
                System.out.print(str.substring(counter,i));
                add="";
                for (; (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') || str.charAt(i) == '.'; i++) {
                    add += str.charAt(i);

                }
                f=Float.valueOf(add);
                i++;

                add="";
                for(;i<str.length() && ( str.charAt(i) >= '0' && str.charAt(i) <= '9');i++){
                    add+=str.charAt(i);
                }
                num=Integer.valueOf(add);
                System.out.print("x "+num+" = "+f*num);
                System.out.println();
                counter1+=num*f;
            }
        }

        System.out.println("total shipping : "+counter1);


    }
}

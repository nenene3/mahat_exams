import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        int num=8;
        int nNum=0;
        Scanner scanner = new Scanner(System.in);
        do{
            num=scanner.nextInt();
            if(num==-1)
                break;
            nNum*=10;
            nNum+=num;
            System.out.println(nNum);
        }while(num!=-1);
        System.out.println(ret(nNum));
    }
    public static int ret(int w){
        int num=0;
        while(w!=0){
            num*=10;
            num+=w%10;
            w/=10;
        }
        System.out.println(num);
        return num;
    }

}

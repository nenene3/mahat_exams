package b2021Aviv;

import java.util.Random;

public class ex5 {
    public static void main(String[] args) {
        Random r = new Random();
        int num=90;
        int counter=0;
        int old=9;
        int random;
        for(int i=0;i<num;i++){
            do {
                random = r.nextInt(91)+10-num+i;
            }while(old>=random);
            System.out.println(random);
            old=random;
            counter++;
        }
        System.out.println(counter);
    }
}

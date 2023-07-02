package magen2;

import java.util.Random;

public class ex7 {
    public static void main(String[] args) {
        Random random=new Random();
        char[] pass=new char[5];
        for(int i=0;i<5 ;i++){
            int r=random.nextInt(2);
            if(r%2==0){
                pass[i]= (char) (97+random.nextInt(26));
            }
            else{
                pass[i]=(char) (48+random.nextInt(10));
            }
        }

        for (char c : pass) System.out.print(c + " ");


        int counter=0;
        int rot=0;
        while(counter!=5){
            for(int i=0;i<10;i++){
                if(counter==5)
                    break;
                rot++;
                if(pass[counter]==(char)48+i) {
                    counter++;
                }
            }
            for(int i=0;i<26;i++){
                if(counter==5)
                    break;
                rot++;
                if(pass[counter]==(char)97+i)
                    counter++;
            }

        }
        System.out.println();
        System.out.println(rot);
    }

}

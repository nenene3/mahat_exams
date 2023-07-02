package ex8;

import java.util.Scanner;

public class Ceremony {

    private int[] songs;


    public Ceremony(){
        this.songs= new int[30];
    }
    public void doChoices(){
        int zero=0;
        int[] number={5,3,1};
        int[] cho=new int[3];
        int counter=0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            for(int i=0;i<cho.length;i++)
                cho[i]=scanner.nextInt()-1;

            if(cho[0]==0 && cho[1]==0 && cho[2]==0)
                break;
            for(int i=0;i<cho.length;i++)
                this.songs[cho[i]]+=number[i];

        }


    }
    public int winner(){
        int position=0;

        for(int i=1;i<songs.length;i++)
            if(songs[position]<songs[i])
                position=i;

         return position+1;

        
    }

}


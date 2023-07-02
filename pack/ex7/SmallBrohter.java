package pack.ex7;

import java.util.Scanner;

public class SmallBrohter {

    private int[] votes;
    private int mumOFPart;


    public SmallBrohter(int n){
        this.votes=new int[n];
        this.mumOFPart=n;
    }
    public int getNumOfPart(){
        return this.mumOFPart;
    }
    public void Init(){
        for(int i=0;i< votes.length;i++){
            if(votes[i]!=-1)
                votes[i]=0;
        }
    }



    public void voting(){
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();

        while(num!=0){
            if(num>0 && num<=this.votes.length && this.votes[num-1]!=-1)
                this.votes[num-1]++;
            num=s.nextInt();

        }
    }

    public void update(){


        if(this.mumOFPart==0)
            return;
        int min=0;
        int position=-1;

        int i=0;
        for(;i<this.votes.length;i++){
            if(this.votes[i]!=-1){
                min=this.votes[i];
                position=i;
                break;
            }
        }
        /// -1 -1 0 0 0 -1 0 -1 -1

        for(;i<this.votes.length;i++){
            if(this.votes[i]!=-1 && this.votes[i]<min) {
                min = this.votes[i];
                position=i;
            }

        }
        this.votes[position]=-1;
        this.mumOFPart=this.mumOFPart-1;
        this.Init();
    }
    public boolean isFinish(){
        if(this.mumOFPart==3){
            int counter=0;
            for(int i=0;i<this.votes.length;i++){
                if(this.votes[i]!=-1){
                    counter++;
                    System.out.println(i+1);
                }
                if(counter==3)
                    break;


            }
            return true;
        }


        return false;
    }

}

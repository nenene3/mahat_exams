package magen2.ex12;

public class TvWeek {


    private TvProgram[] arrProg=new TvProgram[100];
    private int current;

    public TvProgram[] getArrProg() {
        return arrProg;
    }

    public void setArrProg(TvProgram[] arrProg) {
        this.arrProg = arrProg;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }
    public void add(TvProgram other){
        if(current<100){
            this.arrProg[current++]=other;
        }

    }
    public int sports(){
        int counter=0;
        for(int i=0;i<current;i++){
            if(this.arrProg[i].isSport())
                counter++;
        }

        return counter;
    }

}

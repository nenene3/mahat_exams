package magen2.ex11;

public class Weight {
    private int kilo;
    private int gram;
    public Weight(){
        this.gram=0;
        this.kilo=0;
    }

    public void add(Weight other){
        this.kilo+=other.kilo;
        if(this.gram+other.gram>999){
            this.kilo=(this.gram+other.gram)/1000;
            this.gram=(this.gram+other.gram)%1000;
        }
    }

    public Weight(int kilo,int gram){

        this.kilo=kilo;
        this.gram=gram;

    }
    public Weight(int totalGram){
        this.kilo=totalGram/1000;
        this.gram=totalGram%1000;
    }
    public boolean less(Weight other){
        if(this.kilo!= other.kilo)
            return other.kilo>this.kilo;

        return other.gram>this.gram;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getGram() {
        return gram;
    }

    public void setGram(int gram) {
        this.gram = gram;
    }
}

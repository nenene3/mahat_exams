package hhh.ex10;

public class BallPack {


    private Ball[] balls;
    private String[] colors;
    private int numOFBalls;
    private String material;
    private int minSize;

    public BallPack(int num, String[] colors, String material, int minSize) {
        this.balls = new Ball[num];
        this.colors = colors;
        this.numOFBalls = 0;
        this.minSize = minSize;
        this.material = material;
    }

    public boolean isFit(Ball b) {
        if (!this.material.equals(b.getMaterial()) ||
                this.minSize > b.getSize())
            return false;


        for (int i = 0; i < this.colors.length; i++) {
            if (this.colors[i].equals(b.getColor()))
                return true;
        }


        return false;
    }
    public boolean add(Ball b){

        if(isFit(b) && this.numOFBalls < this.balls.length){
            this.balls[this.numOFBalls++]=b;
            return true;
        }
        return false;
    }
    public int countColor(String color){
        int count=0;
        for(int i=0;i<numOFBalls;i++){
            if(this.balls[i].getColor().equals(color))
                count++;
        }
        return count;
    }
    public String[] missingColor(){
        String a ="";
        for(int i=0;i<this.colors.length;i++){
            for(int j=0;j<this.numOFBalls;j++){
                if(this.colors[i].equals(this.balls[j].getColor()))
                    break;
                if(j==this.numOFBalls-1) {
                    a += this.colors[i] + ";";
                }
            }
        }
        return a.split(";");
    }

}

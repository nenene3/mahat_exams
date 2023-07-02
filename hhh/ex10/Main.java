package hhh.ex10;

public class Main {
    public static void main(String[] args) {

        BallPack d= new BallPack(4,new String[] {"blue","green","yellow"},"emerald",7);
        Ball a = new Ball("green",9,"emerald");
        Ball b = new Ball("green",9,"emerald");
        Ball c = new Ball("blue",52,"emerald");
        d.add(a);
        d.add(b);
        d.add(c);
        String[] qwe = d.missingColor();
        for(String s : qwe)
            System.out.print(s+" ");
    }
}

package b2021Aviv.ex2;

public class Main {
    public static void main(String[] args) {
        Snack d = new Snack("s",1000,3,1200);
        System.out.println(d.good());
    }
    public static int goodSnacks(Snack[] arrS){
        int num=0;
        for(int i=0;i<arrS.length;i++)
            if(arrS[i].getCost()<10)
                if(arrS[i].good())
                    num++;

        return num;
    }
}

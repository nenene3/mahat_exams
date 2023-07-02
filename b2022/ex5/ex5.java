package b2022.ex5;

public class ex5 {
    public static void main(String[] args) {

    }
    public static String largeDiskName( Disc d1,Disc d2){

        if(d1.getSongs().length>d2.getSongs().length)
            return d1.getDiskName();
        else
            return d2.getDiskName();

    }
}

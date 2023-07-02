package ex10;

public class Program {
    public static void main(String[] args) {
        City ct = new City();
        int counter=0;
        for(int i=0;i<ct.getNumFamilies();i++){
            if(ct.getNumFamily()[i].reduction()==0)
                counter++;
        }
        System.out.println(counter);
    }
}

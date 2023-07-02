package b2021Aviv.ex7;

public class Main {
    public static void main(String[] args) {

    }
    public static void red(CountryStatus s1,CountryStatus s2){
        for(int i=0;i<s1.getnCity();i++){
            if(s1.getCities()[i].getCityColor().equals("red"))
                for(int j=0;j<s2.getnCity();i++)
                    if(!(s2.getCities()[i].getCityColor().equals("red")) && s2.getCities()[i].getName().equals(s1.getCities()[i].getName()))
                        System.out.println(s1.getCities()[i].getName());

        }
    }
}

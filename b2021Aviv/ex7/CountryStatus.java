package b2021Aviv.ex7;

public class CountryStatus {
    private String date;
    private  CityK[] cities;
    private int nCity;

    public CountryStatus(String date){
        this.date=date;
        this.nCity=0;
        this.cities=new CityK[100];
    }
    public boolean addCity(String name,int numOfResident,int numOFPatient){
        if(numOFPatient>numOfResident && this.nCity>=100)
            return false;
        this.cities[nCity++]=new CityK(name,numOfResident,numOFPatient);
        return true;
    }
    public String[] arr(String color){
        String[] arr= new String[nCity];
        int s=0;
        for(int i=0;i< arr.length;i++)
            if(color.equals(this.cities[i].getCityColor()))
                arr[s++]=this.cities[i].getName();

        return arr;
    }
    public CountryStatus(String date, CityK[] cities, int nCity) {
        this.date = date;
        this.cities = cities;
        this.nCity = nCity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public CityK[] getCities() {
        return cities;
    }

    public void setCities(CityK[] cities) {
        this.cities = cities;
    }

    public int getnCity() {
        return nCity;
    }

    public void setnCity(int nCity) {
        this.nCity = nCity;
    }
}

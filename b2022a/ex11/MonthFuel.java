package b2022a.ex11;

public class MonthFuel {
    private Invoice[] invoices;
    private int current;

    public MonthFuel() {
        this.invoices = new Invoice[1000];
        this.current = 0;
    }
    public void addInvoice(int day,String num,String name,double fuel){
        if(current<1000)
            this.invoices[current++]=new Invoice(day,num,name,fuel);

    }
    public double[] fuelPerDay(){
        double[] arr = new double[32];
        for(int i=0;i<this.current;i++){
            arr[0]+=this.invoices[i].getFuel();
            int z=this.invoices[i].getDay();
            arr[z]+=this.invoices[i].getFuel();
        }
        return arr;
    }
}

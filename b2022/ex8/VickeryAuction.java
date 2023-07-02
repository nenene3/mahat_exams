package b2022.ex8;

public class VickeryAuction {
    private String product;
    private int realPrice;
    private Participant[] arr;
    private int current=0;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(int realPrice) {
        this.realPrice = realPrice;
    }

    public Participant[] getArr() {
        return arr;
    }

    public void setArr(Participant[] arr) {
        this.arr = arr;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public boolean addPar(Participant c1){
        if(this.current>=100 || c1.getPrice()<this.realPrice*0.5)
            return false;

        this.arr[this.current++]=c1;
        return true;
    }
    public Winner findWinner(){
        int price=0;
        int secondPrice=0;
        String name="";
        for(int i=0;i<this.current;i++){
            if(arr[i].getPrice()>price){
                price= arr[i].getPrice();
                name=this.arr[i].getName();
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i].getPrice()<price && arr[i].getPrice()> secondPrice)
                secondPrice=arr[i].getPrice();
        }

        return new Winner(name,secondPrice);
    }
}

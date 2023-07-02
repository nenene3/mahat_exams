package b2021Aviv.ex2;

public class Snack {



    private String name;
    private int weight;
    private double cost;
    private int cal;

    public Snack(String name, int weight, double cost, int cal) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.cal = cal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCal() {
        return cal;
    }

    public void setCal(int cal) {
        this.cal = cal;
    }
    public boolean good(){
        double s=(double)this.weight /100;
        return this.cal/s<=120;
    }
}

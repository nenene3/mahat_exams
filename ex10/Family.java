package ex10;

public class Family {


    private String name;
    private int numStudents;
    private int num;

    public Family(String name, int numStudents, int num) {
        this.name = name;
        this.numStudents = numStudents;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumStudents() {
        return numStudents;
    }

    public void setNumStudents(int numStudents) {
        this.numStudents = numStudents;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public int reduction(){
        int deal=this.numStudents*40;
        if(this.num>=6)
            return Math.max(100, deal);

        return deal;
    }
}

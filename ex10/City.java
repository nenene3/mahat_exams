package ex10;

public class City {
    private Family[] numFamily = new Family[100000];
    private int numFamilies;

    public Family[] getNumFamily() {
        return numFamily;
    }

    public void setNumFamily(Family[] numFamily) {
        this.numFamily = numFamily;
    }

    public int getNumFamilies() {
        return numFamilies;
    }

    public void setNumFamilies(int numFamilies) {
        this.numFamilies = numFamilies;
    }
}

package b2022a.ex7;

public class sportUnion {
    private String unionName;
    private int numberUnion;
    private sportClube[] unionData;

    public String getUnionName() {
        return unionName;
    }

    public void setUnionName(String unionName) {
        this.unionName = unionName;
    }

    public int getNumberUnion() {
        return numberUnion;
    }

    public void setNumberUnion(int numberUnion) {
        this.numberUnion = numberUnion;
    }

    public sportClube[] getUnionData() {
        return unionData;
    }

    public void setUnionData(sportClube[] unionData) {
        this.unionData = unionData;
    }
    public boolean isValid(sportClube sportClube){
        if(this.numberUnion>=100)
            return false;
        for(int i =0;i<numberUnion;i++)
            if(sportClube.getSportName().equals(this.unionData[i].getSportName()))
                if(sportClube.getCity().equals(this.unionData[i].getCity()))
                    if(sportClube.getName().equals(this.unionData[i].getName()))
                        return false;


        return true;
    }
    public int biggestCoach(){
        int max=this.unionData[0].getCountOFCoach();
        for(int i=1;i<this.numberUnion;i++)
            if(max<this.unionData[i].getCountOFCoach())
                max=this.unionData[i].getCountOFCoach();
        return max;
    }
}

package b2022a.ex4;

public class Act {


    private  String actName;
    private int len;
    private Actor[] actArr;
    private int currentNum;



    public Act(String actName,int len){

        this.actName=actName;
        this.len=len;
        this.actArr=new Actor[20];
        this.currentNum=0;
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public Actor[] getActArr() {
        return actArr;
    }

    public void setActArr(Actor[] actArr) {
        this.actArr = actArr;
    }

    public int getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(int currentNum) {
        this.currentNum = currentNum;
    }
    public boolean isSuitable(Actor actor){
        if(this.currentNum>=20){
            System.out.println("no room");
            return false;
        }
        if(actor.getAge()<45 || actor.getNumActs()<=4){
            System.out.println("not suitable");
            return false;
        }
        this.actArr[currentNum++]=actor;
        System.out.println("was added");
        return true;
    }
    public int prof(){
        int counter=0;
        for(int i=0;i<currentNum;i++)
            if(actArr[i].getNumActs()>=10)
                counter++;
        return counter;
    }
}

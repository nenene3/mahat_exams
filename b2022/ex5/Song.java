package b2022.ex5;

public class Song {
    private String name;
    private int length;
    private String performer;


    public Song(String name,int length,String performer){

        this.name=name;
        this.length=length;
        this.performer=performer;
    }
    public String status(){
        return this.performer+"/"+this.name+":"+this.length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }
}

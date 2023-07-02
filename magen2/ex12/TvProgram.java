package magen2.ex12;

public class TvProgram {

    private int day;
    private int code;
    private  boolean isSport;
    public TvProgram(int day,int code,boolean isSport){
        this.code=code;
        this.day=day;
        this.isSport=isSport;
    }


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isSport() {
        return isSport;
    }

    public void setSport(boolean sport) {
        isSport = sport;
    }
}

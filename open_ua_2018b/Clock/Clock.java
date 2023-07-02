package open_ua_2018b.Clock;

public class Clock {

    private int hour;
    private int minute;
    private int second;
    public Clock(int minute,int hour,int second){
        if(minute>59 | minute<0){
            this.minute=0;
        }else {
            this.minute=minute;
        }
        if(hour>=0 && hour<=23){
            this.hour=hour;
        }else{
            this.hour=0;
        }
        if(second>=0 && second<=59 )
            this.second=second;
        else
            this.second=0;
    }
    public boolean before(Clock other){
        if(this.hour!=other.hour)
            return this.hour<other.hour;
        if(this.minute!=other.minute)
            return this.minute<other.minute;
        return this.second< other.second;

    }
    // 5,9,2,4,8
    public boolean after(Clock other){
        return !before(other);
    }
}

package ex123;

import java.util.Arrays;

public class ReportCard {


    private String _stuName;
    private Course[] _courseArray;

    @Override
    public String toString() {
        return "ReportCard{" +
                "_stuName='" + _stuName + '\'' +
                ", _courseArray=" + Arrays.toString(_courseArray) +
                '}';
    }

    public ReportCard(String _stuName, Course[] _courseArray) {
        this._stuName = _stuName;
        this._courseArray = _courseArray;
    }

    public String get_stuName() {
        return _stuName;
    }

    public void set_stuName(String _stuName) {
        this._stuName = _stuName;
    }

    public Course[] get_courseArray() {
        return _courseArray;
    }

    public void set_courseArray(Course[] _courseArray) {
        this._courseArray = _courseArray;
    }
    public double avg(){
        double sum=0;
        for(int i=0;i<_courseArray.length;i++){
            sum+=this._courseArray[i].get_grade();
        }
        return sum / _courseArray.length;
    }
    public boolean isEXC(){
        int counter100=0;
        if(90>this.avg())
            return false;
        for(int i=0;i<_courseArray.length;i++){
            if(_courseArray[i].get_grade()==100)
                counter100++;
            if(_courseArray[i].get_grade()<=59)
                return false;
        }

        return counter100>0;
    }
    public boolean studyCourse(String course){
        for(int i=0;i<this._courseArray.length;i++){
            if(this._courseArray[i].get_courseName().equals(course))
                return true;
        }
        return false;
    }
}

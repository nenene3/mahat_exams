package ex123;

import java.util.Arrays;

public class Faculty {
    private ReportCard[] _students;
    int noOfStudents;

    public ReportCard[] get_students() {
        return _students;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "_students=" + Arrays.toString(_students) +
                ", noOfStudents=" + noOfStudents +
                '}';
    }

    public void set_students(ReportCard[] _students) {
        this._students = _students;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public Faculty(ReportCard[] _students, int noOfStudents) {
        this._students = _students;
        this.noOfStudents = noOfStudents;
    }
    public void print(){
        for(int i=0;i<noOfStudents;i++){
            if(_students[i].isEXC())
                System.out.println(_students[i].get_stuName());
        }
    }
    public int howManyStudy(String course){
        int counter=0;
        for(int i=0;i<noOfStudents;i++){
            if(this._students[i].studyCourse(course))
                counter++;
        }

        return counter;
    }
}

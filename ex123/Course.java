package ex123;

public class Course {
   private String _courseName;
   private int _grade;

    public String get_courseName() {
        return _courseName;
    }

    public void set_courseName(String _courseName) {
        this._courseName = _courseName;
    }

    public int get_grade() {
        return _grade;
    }

    public void set_grade(int _grade) {
        this._grade = _grade;
    }

    @Override
    public String toString() {
        return "Course{" +
                "_courseName='" + _courseName + '\'' +
                ", _grade=" + _grade +
                '}';
    }
}

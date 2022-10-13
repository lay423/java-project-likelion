package java1006.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    List<String> students;

    public ListExercise() {
        this.students = new ArrayList<>();
        students.add("김경록");
        students.add("황준하");
        students.add("허진혁");
        students.add("석시윤");
        students.add("이소영");
        students.add("이아진");
        students.add("오형상");
    }

    public List<String> getStudents(){
        return this.students;
    }
}

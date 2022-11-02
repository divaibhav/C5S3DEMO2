import java.util.Comparator;

public class SortByRollNo implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2){

        if(s1.getRollNo() == s2.getRollNo()){
            return 0;
        }
        if(s1.getRollNo() < s2.getRollNo()){
            return -1;
        }
        return 1;
    }
}

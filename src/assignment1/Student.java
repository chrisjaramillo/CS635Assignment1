package assignment1;

/**
 *
 * @author Christopher Jaramillo
 */
public class Student implements Comparable{
    String name;
    String redId;
    double gpa;
    
    Student()
    {
        name = new String();
        redId = new String();
        gpa = 0.0;
    }
    Student(String name, String redId, Double gpa)
    {
        this.name=name;
        this.redId=redId;
        this.gpa=gpa;
    }
    
    String name()
    {
        return this.name;
    }
    void name(String name)
    {
        this.name=name;
    }
    
    String redId()
    {
        return this.redId;
    }
    void redId(String redId)
    {
        this.redId=redId;
    }
    
    double gpa()
    {
        return this.gpa;
    }
    void gpa(double gpa)
    {
        this.gpa=gpa;
    }

    @Override
    public int compareTo(Object t) {
        Student anotherStudent = (Student)t;
        return this.name().compareTo(anotherStudent.name());
    }
    
    @Override
    public String toString(){
        StringBuffer s = new StringBuffer();
        s.append(name);
        s.append('|');
        s.append(redId);
        s.append('|');
        s.append(gpa);
        return s.toString();
    }
}
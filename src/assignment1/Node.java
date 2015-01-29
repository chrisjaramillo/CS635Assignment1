package assignment1;

/**
 *
 * @author Christopher Jaramillo
 */
public class Node {
    Student student;
    Node previous;
    Node next;
    
    Node()
    {
        student = new Student();
        previous = null;
        next = null;
    }
    Node(Student student)
    {
        this.student = student;
        previous = null;
        next = null;
    }
    Node(String name, String redId, Double gpa)
    {
        this.student = new Student(name,redId,gpa);
        previous = null;
        next = null;
    }
    
    public Student student()
    {
        return this.student;
    }
    
    public Node previous()
    {
        return previous;
    }
    public void previous(Node node)
    {
        this.previous = node;
    }
    
    public Node next()
    {
        return this.next;
    }
    public void next(Node node)
    {
        this.next = node;
    }
    
    /*
     * Adds Nodes maintaining alphabetical order
     */
    public void add(Node aNode)
    {
        if(aNode == null)
        {
            aNode = this;
        }
        else if(aNode.isGreaterThan(this))
        {
            if(aNode.previous() == null)
            {
                this.next(aNode);
                aNode.previous(this);
            }
            else
            {
                this.previous(aNode.previous());
                aNode.previous(this);
                this.next(aNode);
                this.previous().next(this);
            }
        }
        else 
        {
            if(aNode.next() == null)
            {
                aNode.next(this);
                this.previous(aNode);
            }
            else
            {
                this.add(aNode.next());
            }
        }
    }

    public boolean isGreaterThan(Node aNode) 
    {
        return this.student.isGreaterThan(aNode.student());
    }

    public void print() 
    {
        this.student.print();
    }

    boolean onProbation() {
        return student.onProbation();
    }

    void printRedId() {
        student.printRedId();
    }

    public void probationaryGpa(double probationaryGpa) {
        student.probationaryGpa(probationaryGpa);
    }

    public boolean isPerfectGpa() {
        return student.isPerfectGpa();
    }

    void printName() {
        student.printName();
    }
}

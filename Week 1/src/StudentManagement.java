import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class StudentManagement
{

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    private ArrayList<Student> student = new ArrayList<Student>(100);
    private HashSet<String> listGroup = new HashSet<String>();
    private HashSet<String> listID = new HashSet<String>();

    public void addStudent(Student s)
    {
        if( listID.add( s.getID() ) )
        {
            System.out.println("Add student complete: " + s.getID() );
            student.add(s);
            return;
        }
        else
        {
            System.out.println("Id has been using!");
            return;
        }
    }

    public boolean sameGroup(Student s1, Student s2)
    {
        // TODO:
        return s1.getGroup().equals(s2.getGroup());
    }

    public void studentsByGroup()
    {
        // TODO:
        for(int i=0;i< student.size() ;i++ )
        {
            listGroup.add(student.get(i).getGroup());
        }
        Iterator<String> groupIterator = listGroup.iterator();

        while( groupIterator.hasNext() )
        {
            String groupTemp = groupIterator.next();
            if( groupTemp == null ) return;
            System.out.println( "Group: " + groupTemp);
            for( int i=0;i<student.size();i++ )
            {
                if( student.get(i).getGroup().equals( groupTemp ) )
                {
                    System.out.println(student.get(i).getInfo());
                }
            }
        }
    }

    public void removeStudent(String id)
    {
        // TODO:

        /* cach 1
        for(int i=0;i<student.size();i++)
        {
            if( student.get(i).getID().equals(id)) student.remove( student.get(i) );
        }*/

        // cach remove 2

        Iterator<Student> studentIterator = student.iterator();
        while(studentIterator.hasNext())
        {
            if( studentIterator.next().getID().equals(id) )
            {
                studentIterator.remove();
            }
        }
    }

    public static void main(String[] args)
    {
        // TODO:
        Student s1 = new Student("Phạm Hùng Mạnh", "17020882","17020882@vnu.edu.vn");
        Student s2 = new Student();

        s2.setName("Hùng Mạnh");



        ////////////////////// Student Management /////////////////////

        StudentManagement studentManagement = new StudentManagement();
        studentManagement.addStudent(s1);
        studentManagement.addStudent(s2);

        studentManagement.studentsByGroup();

        System.out.println("----------------");
        studentManagement.removeStudent("000");

        studentManagement.studentsByGroup();

    }
}
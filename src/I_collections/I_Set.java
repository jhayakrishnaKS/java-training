package I_collections;

import java.util.HashSet;


public class I_Set {

    public static void main(String[] args) {
        HashSet<Student> name=new HashSet<>();
        name.add(new Student(1,"jkay"));
        name.add(new Student(2,"jkkay"));
        for (Student student:name){
            System.out.print(student.getRollNo());
            System.out.println(" "+student.getName());
        }
    }
}

package I_collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class I_collections {
    public static void main(String[] args) {
        //normal arraylist method
        ArrayList<Student> arrayList=new ArrayList<>();
        arrayList.add(new Student(1,"jkkay"));
        arrayList.add(new Student(2,"krish"));
        //Using setter method
        Student StdSetter=new Student();
        StdSetter.setName("setter");
        StdSetter.setRollNo(6);
        arrayList.add(StdSetter);

        for (Student student:arrayList){
            System.out.println(student.getName());
        }

        System.out.println("After removing");
        arrayList.remove(1);
        for (Student student:arrayList){
            System.out.println(student.getRollNo());
            System.out.println(student.getName());
        }
        //LinkedList
        System.out.println("");
        System.out.println("Linked List");
        LinkedList<Student> linkedList=new LinkedList<>();
        linkedList.add(new Student(3,"hello"));
        linkedList.add(new Student(4,"hi"));
        for (Student student:linkedList){
            System.out.println(student.getName());
        }
        System.out.println("");
        linkedList.remove(0);
        for (Student student:linkedList){
            System.out.println(student.getName());
        }


    }
}

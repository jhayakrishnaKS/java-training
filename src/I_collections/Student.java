package I_collections;

public class Student {
    private int rollNo;
    private String name;

    public Student(){

    }
    public Student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }
    public void  setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    public void  setName(String name){
        this.name=name;
    }
    public int getRollNo(){
       return rollNo;
    }
    public String getName(){
        return name;
    }

}

package task_Daily.Task18_Student;

public class Students {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    private String name;
    private int age;
    private int rollNo;
     public  Students(String Student_name, int student_age, int student_rollNo){
         this.name = Student_name;
         this.age= student_age;
         this.rollNo= student_rollNo;
     }
@Override
public String toString(){
         return  "Student{" +
                 "Name='" + name + '\'' +
                 ", Age=" + age +
                 ", Roll No=" + rollNo +
                 '}';
}
    public static void main(String[] args) {
         Students [] s1 = new Students[4];
         s1[0] = new Students("Dinesh",16, 04);
         s1[1] = new Students("waran",17, 03);
         s1[2] = new Students("dada",18, 02);
         s1[3] = new Students("gang",19, 01);
        for (int i = 0; i < s1.length ; i++) {
            System.out.println(s1[i]);
        }

    }

}

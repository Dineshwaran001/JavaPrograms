package ex_26_Static;

public class Lab168_Static_Examples {
    public static void main(String[] args) {
Person p = new Person();
p.setName("Dinesh");
p.setRole("ATestLead");
        Person p1 = new Person();
p1.setName("ganesh");
p1.setRole("ATL");
        System.out.println(p.getName());
        System.out.println(p.getRole());
        System.out.println(p1.getName());
        System.out.println(p1.getRole());
        Person.staticPerson(); // class name.method name


    }
}
class Person{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    private String name;
    private String role;
    static String Company="Igo";
static void staticPerson(){
    System.out.println("This is static method");

}

}


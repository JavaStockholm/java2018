package constructors;

public class Student {

    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }

    

    @Override
    public String toString() {
        return "Students name is: " + name
                + " and students age is " + age;
    }

}

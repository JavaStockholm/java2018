
package constructors;

public class Constructors {

   
    public static void main(String[] args) {
        
     Student student1= new Student();
     
     student1.name="Malin";
     student1.age=100;
     
     Student student2= new Student();
     
     student2.name="Martin";
     student2.age=50;
     
     Student student3= new Student("Elias", 27);
             
             
             
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
    
}

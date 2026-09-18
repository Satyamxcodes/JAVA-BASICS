class Student{  
    //static variable  
   static int age;  
}  
public class staticvariable{  
   public static void main(String args[]){  
       Student s1 = new Student();  
       Student s2 = new Student();  
      Student.age = 24;
    Student.age = 21;  
       Student.age = 23;  
       System.out.println("S1\'s age is: " + s1.age);  
       System.out.println("S2\'s age is: " + s2.age);  
   }  
} 
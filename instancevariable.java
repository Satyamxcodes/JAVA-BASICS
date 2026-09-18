public class instancevariable {

    // Instance Variables
    public String name;
    public int age = 19;

    // Constructor
    public instancevariable() {
        this.name = "Deepak";
    }

    public static void main(String[] args) {

        // Object Creation
        instancevariable obj = new instancevariable();

        System.out.println("Student Name is: " + obj.name);
        System.out.println("Age: " + obj.age);
    }
}
 class Student {

    String name;
    int rollNo;

    // Static variable 
    static String college = "ABC University";

    // Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Method
    void displayFields() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("College: " + college);
    }

    // Method to print object reference
    void displayObject() {
        System.out.println("Object reference: " + this);
    }

    // Method to print class information
    void displayClassInfo() {
        System.out.println("Class Name: " + this.getClass().getName());
    }
}

public class Main {
    public static void main(String[] args)
    {
        // Create objects
        Student s1 = new Student("Rahul", 101);
        Student s2 = new Student("Priya", 102);
        // Call methods
        System.out.println("== Student 1 ==");
        s1.displayFields();
        s1.displayObject();
        s1.displayClassInfo();

        System.out.println("\n== Student 2 ==");
        s2.displayFields();
        s2.displayObject();
        s2.displayClassInfo();
    }
}



/*Define a class Student with attributes: name, age, and grade. Write a parameterized constructor to initialize these attributes. 
Create an object of the class and call a method showDetails() to display the student's information */

class Student {

    String name;
    int age;
    char grade;

    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void showDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Grade: " + grade);

    }

    public static void main(String[] args) {
        Student obj = new Student("Aarju", 19, 'A');
        obj.showDetails();
    }
}

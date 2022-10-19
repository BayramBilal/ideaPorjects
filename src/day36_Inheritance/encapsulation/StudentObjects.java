package day36_Inheritance.encapsulation;

public class StudentObjects {
    public static void main(String[] args) {
        Student student = new Student("Bilal", 50, 'M', 'B', "Cydeo");


        System.out.println(student);

        student.setAge(45);
        student.setGrade('A');
        student.setName("Ali");
        student.setSchoolName("Java School of Science");
        System.out.println(student);
    }

}

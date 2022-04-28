public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        InstructorManager instructorManager = new InstructorManager();
        Instructor instructor = new Instructor();
        Student student = new Student();


        student.setId(1);
        student.setStudentId(11);
        student.setFirstName("Kayra");
        student.setLastName("Akın");

        instructor.setId(2);
        instructor.setInstructorId(22);
        instructor.setFirstName("Engin");
        instructor.setLastName("Demiroğ");

        studentManager.Lıst();
        studentManager.Login();
        instructorManager.Login();
        instructorManager.toGrade();



    }
}

import entity.Student;
import service.StudentService;

public class Main {
    public static void main(String[] args) {

        StudentService manager = new StudentService();
        Student student1 = new Student(1, "Umut", "Durmuş", 12, 1, "Backend");
        Student student2 = new Student(2, "Ezgi", "Yıldırım", 152, 2, "Backend");
        Student student3 = new Student(3, "Umut", "Bal", 20, 3, "Backend");
        Student student4 = new Student(4, "Umut", "Durmuş", 12, 1, "Backend");

        manager.studentAdd(student1);
        manager.studentAdd(student2);
        manager.studentAdd(student3);
        manager.studentAdd(student4);

        manager.studentRemove(student2);

        manager.allStudentShow();

    }
}
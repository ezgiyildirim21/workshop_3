package service;

import entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    List<Student> students = new ArrayList<Student>();
    public StudentService(){

    }
    public void studentAdd(Student student){
        if(isStudentValid(student.getStudentNo())|| isStudentValid(student.getNationalityId())) {
            System.out.println("Öğrenci kayıtlı.");
        } else {
            students.add(student);
            System.out.println("Öğrenci eklendi.");
        }
    }
    public void studentRemove(Student student){
        students.remove(student);
    }
    public void allStudentShow(){
        for(Student student : students) {
            System.out.println("Öğrenci: " + student.getFirstName() + " " + student.getLastName());
        }
    }

    public boolean isStudentValid(int id){
        for(Student student: students){
            if(student.getStudentNo() == id || student.getNationalityId() == id){
                return true;
            }
        }
        return false;
    }
}

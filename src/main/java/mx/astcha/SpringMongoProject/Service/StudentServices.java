package mx.astcha.SpringMongoProject.Service;

import mx.astcha.SpringMongoProject.Entity.Student;
import mx.astcha.SpringMongoProject.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServices {

    @Autowired
    private StudentRepo repo;
    public void saveorUpdate(Student students) {

        repo.save(students);
    }

    public Iterable<Student> listAll() {

        return this.repo.findAll();
    }

    public void deleteStudent(String id) {

        repo.deleteById(id);
    }

    public Student getStudentByID(String studentId) {
        return repo.findById(studentId).get();
    }
}

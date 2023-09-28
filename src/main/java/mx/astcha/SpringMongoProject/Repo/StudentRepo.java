package mx.astcha.SpringMongoProject.Repo;

import mx.astcha.SpringMongoProject.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student, String > {
}

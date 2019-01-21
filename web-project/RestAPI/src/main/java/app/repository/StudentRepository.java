package app.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import app.modal.Student;
public interface StudentRepository extends JpaRepository<Student, Long> {

}
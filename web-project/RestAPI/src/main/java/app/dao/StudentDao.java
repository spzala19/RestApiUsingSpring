package app.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.modal.Student;
import app.repository.StudentRepository;


@Service
public class StudentDao {
	
	@Autowired
	StudentRepository studentRepository;
	
	/*to save an student*/
	
	public Student save(Student std) {
		return studentRepository.save(std);
	}
	
	
	/* search all student*/
	
	public List<Student> findAll(){
		return studentRepository.findAll();
	}
	
	
	/*get an student by id*/
	public Student findOne(Long stdid) {
		return studentRepository.findOne(stdid);
	}
	
	
	/*delete an student*/
	
	public void delete(Student std) {
		studentRepository.delete(std);
	}
	

}

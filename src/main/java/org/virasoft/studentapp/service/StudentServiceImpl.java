package org.virasoft.studentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.virasoft.studentapp.model.Student;
import org.virasoft.studentapp.repository.StudentRepository;

/**
 * Service implementation for CRUD operations business logic for
 * {@link org.virasoft.studentapp.model.Student} objects.
 * 
 * @author Danushka Wirajith
 *
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public int delete(String id) {

		return studentRepository.delete(id);
	}

	@Override
	public Student save(Student student) {

		return studentRepository.save(student);
	}

	@Override
	public Student update(String id, Student student) {

		student.setId(id);
		return studentRepository.update(student);
	}

	@Override
	public List<Student> list() {

		return studentRepository.list();
	}

	@Override
	public Student getById(String id) {

		return studentRepository.getById(id);
	}

	/**
	 * @return the studentRepository
	 */
	public StudentRepository getStudentRepository() {
		return studentRepository;
	}

	/**
	 * @param studentRepository
	 *            the studentRepository to set
	 */
	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

}

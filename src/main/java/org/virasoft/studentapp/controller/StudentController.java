/**
 * 
 */
package org.virasoft.studentapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.virasoft.studentapp.model.Student;
import org.virasoft.studentapp.service.StudentService;

/**
 * This controller provides the public API for managing students.
 * 
 * @author Danushka Wirajith
 *
 */
@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/students", method = RequestMethod.POST)
	public Student saveStudent(@RequestBody Student student) {

		return studentService.save(student);
	}

	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public List<Student> listStudents(Model model) {

		return studentService.list();
	}

	@RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
	public Student getStudent(@PathVariable("id") String id) {

		return studentService.getById(id);
	}

	@RequestMapping(value = "/students/{id}", method = RequestMethod.PUT)
	public Student updateStudent(@PathVariable("id") String id,
			@RequestBody Student student) {

		return studentService.update(id, student);
	}

	@RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)
	public int deleteStudent(@PathVariable("id") String id) {

		return studentService.delete(id);
	}

	/**
	 * @return the studentService
	 */
	public StudentService getStudentService() {
		return studentService;
	}

	/**
	 * @param studentService
	 *            the studentService to set
	 */
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
}

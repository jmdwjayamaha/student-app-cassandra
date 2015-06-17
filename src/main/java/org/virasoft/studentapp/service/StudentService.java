package org.virasoft.studentapp.service;

import java.util.List;

import org.virasoft.studentapp.model.Student;

/**
 * This service provides CRUD operations business logic for
 * {@link org.virasoft.studentapp.model.Student} objects.
 * 
 * @author Danushka Wirajith
 *
 */
public interface StudentService {

	/**
	 * Handle the deletion logic of the student.
	 * 
	 * @param id
	 *            The ID of the student to be deleted.
	 * @return The status of the delete operation from the database.
	 */
	int delete(String id);

	/**
	 * Handle the student creation logic.
	 * 
	 * @param student
	 *            The student to be saved.
	 * @return The information of the saved student.
	 */
	Student save(Student student);

	/**
	 * Handle the update logic of the student.
	 * 
	 * @param id
	 *            The id of student to be updated.
	 * @param student
	 *            The student to be updated.
	 * @return The information of the updated student.
	 */
	Student update(String id, Student student);

	/**
	 * Process all the students for the front end.
	 * 
	 * @return The information of all student entries from the database.
	 */
	List<Student> list();

	/**
	 * Process requests for a single student.
	 * 
	 * @param id
	 *            The ID of the requested student.
	 * @return The information of the found student.
	 */
	Student getById(String id);
}

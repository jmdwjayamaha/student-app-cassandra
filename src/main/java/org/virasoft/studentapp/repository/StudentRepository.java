package org.virasoft.studentapp.repository;

import java.util.List;

import org.virasoft.studentapp.model.Student;

/**
 * This repository provides CRUD operations for
 * {@link org.virasoft.studentapp.model.Student} objects.
 * 
 * @author Danushka Wirajith
 *
 */
public interface StudentRepository {

	String STUDENT_COLLECTION = "student";
	
	/**
	 * Delete the specified from the database.
	 * 
	 * @param id
	 *            The ID of the student to be deleted.
	 * @return The status of the delete operation from the database.
	 */
	int delete(String id);

	/**
	 * Save the specified student to the database.
	 * 
	 * @param student
	 *            The student to be saved.
	 * @return The information of the saved student.
	 */
	Student save(Student student);

	/**
	 * Update the specified student in the database.
	 * 
	 * @param student
	 *            The student to be updated.
	 * @return The information of the updated student.
	 */
	Student update(Student student);

	/**
	 * List all student entries from the database.
	 * 
	 * @return The information of all student entries from the database.
	 */
	List<Student> list();

	/**
	 * Retrieve the information of a single student by ID.
	 * 
	 * @param id
	 *            The ID of the requested student.
	 * @return The information of the found student.
	 */
	Student getById(String id);
}

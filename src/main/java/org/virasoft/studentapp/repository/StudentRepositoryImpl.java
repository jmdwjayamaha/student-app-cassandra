/**
 * 
 */
package org.virasoft.studentapp.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Repository;
import org.virasoft.studentapp.model.Student;

import com.datastax.driver.core.querybuilder.Delete;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.datastax.driver.core.querybuilder.Select;

/**
 * Repository implementation for CRUD operations for
 * {@link org.virasoft.studentapp.model.Student} objects.
 * 
 * @author Danushka Wirajith
 *
 */
@Repository("studentRepository")
public class StudentRepositoryImpl implements StudentRepository {

	@Autowired
	private CassandraOperations cassandraOperations;
	
	@Override
	public int delete(String id) {

		Delete delete = QueryBuilder.delete().from(STUDENT_COLLECTION);
		delete.where(QueryBuilder.eq("id", id));
		cassandraOperations.execute(delete);
		
		return 0;
	}

	@Override
	public Student save(Student student) {

		UUID uuid = UUID.randomUUID();
		student.setId(uuid.toString());
		cassandraOperations.insert(student);
		
		return student;
	}

	@Override
	public Student update(Student student) {

		cassandraOperations.update(student);
		return student;
	}

	@Override
	public List<Student> list() {

		return cassandraOperations.select("SELECT * FROM student", Student.class);
	}

	@Override
	public Student getById(String id) {

		Select select = QueryBuilder.select().from(STUDENT_COLLECTION);
		select.where(QueryBuilder.eq("id", id));
		
		return cassandraOperations.selectOne(select, Student.class);
	}
}

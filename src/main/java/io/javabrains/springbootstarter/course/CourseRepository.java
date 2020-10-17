package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

// CrudRepository contains all the standard implementations for get, update, delete, etc. 
// so only custom methods need to be implemented. CrudRepository is a generic, 
// so the entity and key type must be specified
public interface CourseRepository extends CrudRepository<Course, String>{

	// using find tells Spring API to use a find type method, by suggests the field or column in database
	// with this Spring will implement the method for you!
	public List<Course> findByName(String name);
	public List<Course> findByDescription(String description);
	public List<Course> findByTopicId(String topicId); // tell spring to look for the topic id field in topic within the course object
}
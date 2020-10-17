package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired // connects this class with interface
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId){
		List<Course> courses = new ArrayList<>(); // create list to hold return values
		courseRepository.findByTopicId(topicId) // returns an iterable
		.forEach(courses::add); // copies each item returned into list
		return courses;
	}
	
	public Course getCourse(String id) {
		return courseRepository.findById(id).get();
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
		
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
		
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}

}

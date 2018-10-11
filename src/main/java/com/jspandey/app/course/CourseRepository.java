package com.jspandey.app.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {

	public List<Course> findByTopicId(String topicId);//we don't need implmentation for that justdecleare findByProperty name format the spring Data jpa implement method
	
}

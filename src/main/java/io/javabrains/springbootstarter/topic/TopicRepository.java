package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

// CrudRepository contains all the standard implementations for get, update, delete, etc. 
// so only custom methods need to be implemented. CrudRepository is a generic, 
// so the entity and key type must be specified
public interface TopicRepository extends CrudRepository<Topic, String>{

}

package com.balaji.moongodb.repository;

import com.balaji.moongodb.entity.StudentDom;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<StudentDom, String> {
}

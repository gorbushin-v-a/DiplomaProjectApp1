package com.example.diplomaprojectaddapp1.repository;

import com.example.diplomaprojectaddapp1.documents.Testcoll;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestcollRepository extends MongoRepository<Testcoll, String> {


}

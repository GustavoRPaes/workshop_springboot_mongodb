package com.gustavo.workshopspringbootmongdb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gustavo.workshopspringbootmongdb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
}

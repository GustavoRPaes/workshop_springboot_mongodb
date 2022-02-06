package com.gustavo.workshopspringbootmongdb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.workshopspringbootmongdb.domain.Post;
import com.gustavo.workshopspringbootmongdb.repository.PostRepository;
import com.gustavo.workshopspringbootmongdb.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}

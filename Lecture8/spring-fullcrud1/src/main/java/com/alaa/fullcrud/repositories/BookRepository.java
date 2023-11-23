package com.alaa.fullcrud.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alaa.fullcrud.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

	// READ ALL
	List<Book> findAll();
}

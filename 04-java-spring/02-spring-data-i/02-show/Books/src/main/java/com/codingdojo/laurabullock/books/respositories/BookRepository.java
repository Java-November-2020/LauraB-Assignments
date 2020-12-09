package com.codingdojo.laurabullock.books.respositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.laurabullock.books.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
	//SELECT * FROM books
	List<Book> findAll();
}

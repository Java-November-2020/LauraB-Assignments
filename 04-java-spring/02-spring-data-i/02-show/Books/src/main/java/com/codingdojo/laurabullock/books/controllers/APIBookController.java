package com.codingdojo.laurabullock.books.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.laurabullock.books.models.Book;
import com.codingdojo.laurabullock.books.services.BookService;

@RestController //Only good for API
@RequestMapping("/books")
public class APIBookController {
	private BookService bService;
	
	public APIBookController(BookService service) {
		this.bService = service;
	}
	
	//ROUTES:
	
	//Get All Books

	@RequestMapping("")
	public List<Book> index(){
		return this.bService.getAllBooks();
	}
	
	
	//Get One Book (Read)
	@RequestMapping("/{id}")  //Get Request
	public Book getBook(@PathVariable("id") Long id) {
		return this.bService.getSingleBook(id);
	}
	
	//Create A Book
	@RequestMapping(value="/", method=RequestMethod.POST) //Post Request
	public Book create(Book book) {
		return this.bService.createBook(book);
	}
	
	//Update a Book
	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	public Book edit(@PathVariable("id") Long id, Book updatedBook) {
		return this.bService.updateBook(updatedBook);
	}

	//Delete a Book
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteBook(@PathVariable("id") Long id) {
		this.bService.deleteBook(id);
	}
}

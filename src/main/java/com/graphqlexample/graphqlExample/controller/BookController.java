package com.graphqlexample.graphqlExample.controller;

import com.graphqlexample.graphqlExample.entities.Book;
import com.graphqlexample.graphqlExample.repo.BookRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class BookController
{
	private final BookRepository bookRepository;

	public BookController(final BookRepository bookRepository)
	{
		this.bookRepository = bookRepository;
	}

	@QueryMapping
	public Iterable<Book> getBooks()
	{
		return this.bookRepository.findAll();
	}

	@QueryMapping
	public Optional<Book> getBookById(@Argument final long id)
	{
		return bookRepository.findById(id);
	}


}
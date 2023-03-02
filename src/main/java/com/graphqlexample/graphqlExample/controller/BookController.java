package com.graphqlexample.graphqlExample.controller;

import com.graphqlexample.graphqlExample.entities.Book;
import com.graphqlexample.graphqlExample.repo.BookRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Optional;
import java.util.UUID;

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
/**
 *         "id": "13487ec7-e9d5-440e-b67c-5bc7663d3fe0"
 *       },
 *       {
 *         "id": "eedeaf12-ead2-40fa-92fb-8f67ec49dbbc"
 */
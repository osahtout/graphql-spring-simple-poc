package com.graphqlexample.graphqlExample.controller;

import com.graphqlexample.graphqlExample.entities.Author;
import com.graphqlexample.graphqlExample.entities.Book;
import com.graphqlexample.graphqlExample.entities.BookInput;
import com.graphqlexample.graphqlExample.repo.AuthorRepository;
import com.graphqlexample.graphqlExample.repo.BookRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class AuthorController
{
	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;

	public AuthorController(final AuthorRepository authorRepository, final BookRepository bookRepository)
	{
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}

	@QueryMapping
	public Iterable<Author> getAuthors()
	{
		return this.authorRepository.findAll();
	}

	@QueryMapping
	public Optional<Author> getAuthorById(@Argument final long id)
	{
		return this.authorRepository.findById(id);
	}






	@MutationMapping
	public Book createBook(@Argument BookInput bookInput) {
		Author author = this.authorRepository.findById(bookInput.getAuthorId()).orElseThrow();
		return this.bookRepository.save(new Book(bookInput.getTitle(), bookInput.getChapters(), author));
	}

}

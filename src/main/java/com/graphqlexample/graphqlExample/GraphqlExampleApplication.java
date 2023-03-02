package com.graphqlexample.graphqlExample;

import com.graphqlexample.graphqlExample.entities.Author;

import com.graphqlexample.graphqlExample.entities.Book;
import com.graphqlexample.graphqlExample.repo.AuthorRepository;

import com.graphqlexample.graphqlExample.repo.BookRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class GraphqlExampleApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(GraphqlExampleApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(AuthorRepository authorRepository, BookRepository bookRepository)
	{
		return args -> {

			Author bob = authorRepository.save(new Author("Bob", 1990));
			Author joe = authorRepository.save(new Author("Joe", 2001));

			bookRepository.saveAll(List.of(
					new Book("notHarryPotter", 50, bob),
					new Book("Fake Song of Ice and Fire", 70, joe)
			));
		};
	}
}

package com.graphqlexample.graphqlExample.repo;

import com.graphqlexample.graphqlExample.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long>
{
}

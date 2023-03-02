package com.graphqlexample.graphqlExample.repo;

import com.graphqlexample.graphqlExample.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AuthorRepository extends CrudRepository<Author, Long>
{
}

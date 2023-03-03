package com.graphqlexample.graphqlExample.repo;

import com.graphqlexample.graphqlExample.entities.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>
{
}

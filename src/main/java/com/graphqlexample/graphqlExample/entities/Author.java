package com.graphqlexample.graphqlExample.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Author
{
	@Id
	@Generated
	private Long id;
	private String name;
	private int birth;

	@OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
	private List<Book> books;




	private static long ids = 0;
	public Author()
	{
		this.id = ids++;
		this.name = "";
		this.birth = 0;
	}

	public Author(final String name, final int birth)
	{
		this.id = ids++;
		this.name = name;
		this.birth = birth;
	}

	public Author(final UUID id, final String name, final int birth)
	{
		this.id = ids++;
		this.name = name;
		this.birth = birth;
	}

}

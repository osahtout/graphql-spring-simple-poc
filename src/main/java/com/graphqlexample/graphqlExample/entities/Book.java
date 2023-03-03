package com.graphqlexample.graphqlExample.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Generated;

import java.io.Serializable;

@Entity
public class Book implements Serializable
{
	@Id
	@Generated
	private long id;
	private String title;

	private int chapters;

	@ManyToOne(fetch = FetchType.LAZY)
	private Author author;



	private static long ids = 0;
	public Book()
	{
		this.id = ids++;
		this.title = "";
		this.chapters = 0;
		this.author = null;
	}

	public Book(final String title, final int chapters, final Author author)
	{
		this.id	= ids++;
		this.title = title;
		this.chapters = chapters;
		this.author = author;
	}

	public Book(final long id, final String title, final int chapters, final Author author)
	{
		this.id	= id;
		this.title = title;
		this.chapters = chapters;
		this.author = author;
	}

}

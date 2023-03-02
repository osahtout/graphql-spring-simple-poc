package com.graphqlexample.graphqlExample.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



public class BookInput
{
	private String title;
	private int chapters;
	private long authorId;

	public BookInput(final String title, final int chapters, final long authorId)
	{
		this.title = title;
		this.chapters = chapters;
		this.authorId = authorId;
	}

	public long getAuthorId()
	{
		return authorId;
	}

	public String getTitle()
	{
		return title;
	}

	public int getChapters()
	{
		return chapters;
	}


}

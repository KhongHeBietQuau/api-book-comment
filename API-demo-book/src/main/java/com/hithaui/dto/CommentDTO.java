package com.hithaui.dto;

public class CommentDTO {
	
	private String name;
		
	private String content; 
	
	private Integer bookId;
	
	private Integer userId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public CommentDTO(String name, String content, Integer bookId, Integer userId) {
		super();
		this.name = name;
		this.content = content;
		this.bookId = bookId;
		this.userId = userId;
	}

	public CommentDTO() {
		super();
	}

	
	
	
}

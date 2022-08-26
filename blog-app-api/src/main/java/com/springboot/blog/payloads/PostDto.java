package com.springboot.blog.payloads;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
	private Integer postId;
	
	private String title;

	private String content;

	private String imageName;

	private Date addedDate;

	private CategoryDto category;

	private UserDto user;
}

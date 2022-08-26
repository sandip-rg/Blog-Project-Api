package com.springboot.blog.payloads;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
	private Integer categoryId;
	@NotBlank
	@Size(min = 3, message="Category Title must be min of 3 chars")
	private String categoryTitle;
	@NotBlank
	@Size(min = 10, message="Category Description must be min of 10 chars")
	private String categoryDescription;
}

package com.springboot.blog.services;

import java.util.List;

import com.springboot.blog.payloads.PostDto;
import com.springboot.blog.payloads.PostResponse;

public interface PostService {
	//create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId );
	
	//update
	PostDto  updatePost(PostDto postDto, Integer postId);
	
	//delete
	void deletePost(Integer postId);
	
	//getAll
	PostResponse getAllPosts(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
	
	//getById
	PostDto getPostById(Integer postId);
	
	//get all post by category
	List<PostDto> getPostByCategory(Integer categoryId);
	
	//get All post by user
	List<PostDto> getPostByUser(Integer userId);
	
	//search
	List<PostDto> searchPosts(String keyword);
}

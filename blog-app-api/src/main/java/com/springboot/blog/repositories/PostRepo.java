package com.springboot.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.blog.entities.Category;
import com.springboot.blog.entities.Post;
import com.springboot.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer>{
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
//	//seach
//	@Query("select p from Post p where p.title like:key")
//	List<Post> searchByTitle(@Param("key") String title);
	//OR
	List<Post> findByTitleContaining(String title);
}

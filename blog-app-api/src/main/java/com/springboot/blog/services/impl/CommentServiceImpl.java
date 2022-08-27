package com.springboot.blog.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.blog.entities.Comment;
import com.springboot.blog.entities.Post;
import com.springboot.blog.entities.User;
import com.springboot.blog.exceptions.ResourceNotFoundException;
import com.springboot.blog.payloads.CommentDto;
import com.springboot.blog.repositories.CommentRepo;
import com.springboot.blog.repositories.PostRepo;
import com.springboot.blog.repositories.UserRepo;
import com.springboot.blog.services.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private PostRepo postRepo;

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private CommentRepo commentRepo;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CommentDto createComment(CommentDto commentDto, Integer postId, Integer userId) {
		User user = this.userRepo.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User", "User Id", userId));
		Post post = this.postRepo.findById(postId)
				.orElseThrow(() -> new ResourceNotFoundException("Post", "Post Id", postId));
		Comment comment = this.modelMapper.map(commentDto, Comment.class);
		comment.setUser(user);
		comment.setPost(post);
		Comment saveComment = this.commentRepo.save(comment);
		return this.modelMapper.map(saveComment, CommentDto.class);
	}

	@Override
	public void deleteComment(Integer commentId) {
		Comment comment = this.commentRepo.findById(commentId)
				.orElseThrow(() -> new ResourceNotFoundException("Comment", "Comment Id", commentId));
		this.commentRepo.delete(comment);
	}

}

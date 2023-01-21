package com.example.Media.service;

import com.example.Media.POJO.*;
import com.example.Media.repositor.CommentRepository;
import com.example.Media.repositor.UserRepository;
import com.example.Media.repositor.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.Optional;


@Service
@AllArgsConstructor
public class MediaService {

    private final UserRepository userRepository;

    private final PostRepository postRepository;

    private final CommentRepository commentRepository;

    public String Posting(Post post) {

        Optional<Users> user = userRepository.findById(post.getUserId());

        Users user1 = user.orElse(null);

        if (user1!=null) {

            postRepository.save(post);

            return "Post was created successful";

        }else {

            return "This user does not exist";

        }
    }

    public String Commenting(Comment comment){

        Optional<Post> post = postRepository.findById(comment.getPostId());

        Post post1 = post.orElse(null);

        if (post1!=null){

            commentRepository.save(comment);

            return "Comment was submitted successful";

        }else {

            return "This post does not exist";

        }

    }

    public String getAllPosts(postAndCommentRequest postAndCommentRequest){

        Optional<Post> post = postRepository.findById(postAndCommentRequest.getRequestId());

        Optional<Comment> comment = commentRepository.findById(postAndCommentRequest.getRequestId());

        Post post1 = post.orElse(null);

        Comment comment1 = comment.orElse(null);

        String postAndComment = post1.getContext() + " <<and comment of this post>> " + comment1.getContext() ;

        if (post1!=null && comment1!=null){

            return postAndComment;

        }else {

            return "Post with this id doesn't exist.";

        }

    }

}

package com.example.Media.repositor;

import com.example.Media.POJO.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {

}

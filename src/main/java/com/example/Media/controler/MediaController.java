package com.example.Media.controler;

import com.example.Media.POJO.*;
import com.example.Media.service.MediaService;
import com.example.Media.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/media/")
@AllArgsConstructor

public class MediaController {

    private final UserService userService;

    private final MediaService mediaService;

    @PutMapping("/registration")
    public void registration(@RequestBody Users users){

        userService.addUser(users);

    }

    @PostMapping("/posting")
    public String posting(@RequestBody Post post){

        return mediaService.Posting(post);

    }

    @PutMapping("/addComment")
    public String addComment(@RequestBody Comment comment){

        return mediaService.Commenting(comment);

    }

    @GetMapping("/get-all-posts")
    public String getAllPosts(@RequestBody postAndCommentRequest postAndCommentRequest){

        return mediaService.getAllPosts(postAndCommentRequest);

    }

}

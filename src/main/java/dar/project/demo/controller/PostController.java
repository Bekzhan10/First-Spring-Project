package dar.project.demo.controller;

import dar.project.demo.model.PostModel;
import dar.project.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping
public class PostController {

    @Autowired
    private PostService postService;


    @GetMapping("/check")
    public ResponseEntity<String> checkIfWorking() {
        return new ResponseEntity<>("post-core-api is working", HttpStatus.OK);
    }

    @PostMapping("/post")
    public PostModel sendPost(@Valid @RequestBody PostModel postModel) {
        postService.createPost(postModel);
        return postModel;
    }

    @GetMapping("/post/all")
    public List<PostModel> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/post/{postId}")
    public PostModel getPostStatusById(@PathVariable String postId) {
        return postService.getPostById(postId);
    }

    @PutMapping("/post/{postId}")
    public PostModel updatePostById(@PathVariable String postId, @Valid @RequestBody PostModel postModel) {
        postService.updatePostById(postId,postModel);
        return postModel;
    }

    @DeleteMapping("/post/{userId}")
    public void deletePostById(@PathVariable String userId) {
        postService.deletePostById(userId);
    }
}

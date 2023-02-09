package dar.project.demo.service;

import dar.project.demo.model.PostModel;

import java.util.List;

public interface PostService {
     void createPost(PostModel postModel);
     List<PostModel> getAllPosts();
     PostModel getPostById(String postId);
     void updatePostById(String postId, PostModel postModel);
     void deletePostById(String postId);
}

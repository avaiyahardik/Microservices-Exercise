package com.assessment.postservice.service;

import com.assessment.postservice.dto.PostRequest;
import com.assessment.postservice.dto.PostResponse;
import com.assessment.postservice.exception.BadRequestException;
import com.assessment.postservice.mapper.PostMapper;
import com.assessment.postservice.model.Post;
import com.assessment.postservice.repository.PostRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    private final PostMapper postMapper;

    private Post findById(long id) {
        return postRepository.findById(id).orElseThrow(() -> new BadRequestException("Post not found"));
    }

    public PostResponse createPost(PostRequest request) {
        return postMapper.response(postRepository.save(postMapper.post(request)));
    }

    public PostResponse getPost(long id) {
        return postMapper.response(findById(id));
    }

    public List<PostResponse> getPosts() {
        return postMapper.response(postRepository.findAll());
    }

    public PostResponse updatePost(long id, PostRequest request) {
        var currentPost = findById(id);
        return postMapper.response(postRepository.save(postMapper.update(currentPost, request)));
    }

    public void deletePost(long id) {
        postRepository.delete(findById(id));
    }

}

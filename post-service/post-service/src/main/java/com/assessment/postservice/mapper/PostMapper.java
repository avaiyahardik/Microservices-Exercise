package com.assessment.postservice.mapper;

import com.assessment.postservice.dto.PostRequest;
import com.assessment.postservice.dto.PostResponse;
import com.assessment.postservice.model.Post;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface PostMapper {
    Post post(PostRequest request);

    PostResponse response(Post post);

    List<PostResponse> response(List<Post> postList);

    Post update(@MappingTarget Post post, PostRequest request);
}

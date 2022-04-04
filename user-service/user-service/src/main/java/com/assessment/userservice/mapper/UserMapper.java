package com.assessment.userservice.mapper;

import com.assessment.userservice.dto.UserRequest;
import com.assessment.userservice.dto.UserResponse;
import com.assessment.userservice.model.User;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User user(UserRequest request);

    UserResponse userResponse(User user);

    List<UserResponse> userResponse(List<User> user);

    User update(@MappingTarget User user, UserRequest request);
}

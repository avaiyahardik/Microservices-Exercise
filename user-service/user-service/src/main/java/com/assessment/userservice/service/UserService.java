package com.assessment.userservice.service;

import com.assessment.userservice.dto.UserRequest;
import com.assessment.userservice.dto.UserResponse;
import com.assessment.userservice.exception.BadRequestException;
import com.assessment.userservice.mapper.UserMapper;
import com.assessment.userservice.model.User;
import com.assessment.userservice.repository.UserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    private User findById(long id) {
        return userRepository.findById(id).orElseThrow(() -> new BadRequestException("User not found"));
    }

    public UserResponse createUser(UserRequest request) {
        return userMapper.userResponse(userRepository.save(userMapper.user(request)));
    }

    public UserResponse getUser(long id) {
        return userMapper.userResponse(findById(id));
    }

    public List<UserResponse> getUsers() {
        return userMapper.userResponse(userRepository.findAll());
    }

    public UserResponse updateUser(long id, UserRequest request) {
        var currentUser = findById(id);
        return userMapper.userResponse(userRepository.save(userMapper.update(currentUser, request)));
    }

    public void deleteUser(long id) {
        userRepository.delete(findById(id));
    }

}

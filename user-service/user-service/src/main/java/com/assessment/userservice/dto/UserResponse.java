package com.assessment.userservice.dto;

import lombok.Data;

@Data
public class UserResponse {
    private long id;
    private String firstname;
    private String lastname;
    private String email;
}

package com.assessment.userservice.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class UserRequest {
    @NotBlank
    @Size(max = 25)
    private String firstname;

    @Size(max = 25)
    private String lastname;

    @Size(max = 64)
    @Email
    @NotBlank
    private String email;
}

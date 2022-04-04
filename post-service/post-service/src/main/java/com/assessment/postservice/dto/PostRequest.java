package com.assessment.postservice.dto;

import java.time.OffsetDateTime;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PostRequest {
    @NotBlank
    private String title;

    private OffsetDateTime createdAt = OffsetDateTime.now();

    @NotNull
    private Long createdBy; // created by user id
}

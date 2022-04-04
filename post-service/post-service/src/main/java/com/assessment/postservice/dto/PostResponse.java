package com.assessment.postservice.dto;

import java.time.OffsetDateTime;
import lombok.Data;

@Data
public class PostResponse {
    private long id;
    private String title;
    private OffsetDateTime createdAt;
    private long createdBy; // created by user id
}

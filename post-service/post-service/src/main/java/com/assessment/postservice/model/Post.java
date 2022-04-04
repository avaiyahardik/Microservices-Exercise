package com.assessment.postservice.model;

import com.assessment.postservice.entitylisteners.PostEntityAuditListener;
import java.time.OffsetDateTime;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@EntityListeners(PostEntityAuditListener.class)
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    private String title;

    private OffsetDateTime createdAt;

    @NotNull
    private Long createdBy; // created by user id
}

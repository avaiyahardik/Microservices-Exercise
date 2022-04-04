package com.assessment.postservice.entitylisteners;

import com.assessment.postservice.model.Post;
import javax.persistence.PostPersist;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PostEntityAuditListener {

    @PostPersist
    private void afterPostCreate(Post post) {
        log.info("Writing to Kafka here for post id [{}]", post.getId());
    }

}

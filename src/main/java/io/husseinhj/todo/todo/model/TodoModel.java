package io.husseinhj.todo.todo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.UUID;

public class TodoModel {
    private final UUID id;
    private final String body;
    private final String title;
    private final String userId;
    private final double modified;
    private final UUID categoryId;
    private final List<UUID> tags;
    private final double createdAt;

    public TodoModel(@JsonProperty("id") UUID id,
                     @JsonProperty("body") String body,
                     @JsonProperty("title") String title,
                     @JsonProperty("userId") String userId,
                     @JsonProperty("modified") double modified,
                     @JsonProperty("categoryId") UUID categoryId,
                     @JsonProperty("tags") List<UUID> tags,
                     @JsonProperty("createdAt") double createdAt) {
        this.id = id;
        this.body = body;
        this.title = title;
        this.userId = userId;
        this.modified = modified;
        this.categoryId = categoryId;
        this.tags = tags;
        this.createdAt = createdAt;
    }
}

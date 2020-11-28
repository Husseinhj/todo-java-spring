package io.husseinhj.todo.todo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.UUID;

public class TodoModel {
    private UUID id;
    private long modified;
    private long createdAt;
    private final String body;
    private final String title;
    private final UUID userId;
    private final UUID categoryId;
    private final List<UUID> tags;

    public TodoModel(@JsonProperty("body") String body,
                     @JsonProperty("title") String title,
                     @JsonProperty("userId") UUID userId,
                     @JsonProperty("modified") long modified,
                     @JsonProperty("categoryId") UUID categoryId,
                     @JsonProperty("tags") List<UUID> tags) {
        this.createdAt = System.currentTimeMillis();
        this.id = UUID.randomUUID();

        this.body = body;
        this.title = title;
        this.userId = userId;
        this.modified = modified;
        this.categoryId = categoryId;
        this.tags = tags;
    }

    public TodoModel(@JsonProperty("id") UUID id,
                     @JsonProperty("body") String body,
                     @JsonProperty("title") String title,
                     @JsonProperty("userId") UUID userId,
                     @JsonProperty("modified") long modified,
                     @JsonProperty("categoryId") UUID categoryId,
                     @JsonProperty("tags") List<UUID> tags,
                     @JsonProperty("createdAt") long createdAt) {
        this.id = id;
        this.body = body;
        this.title = title;
        this.userId = userId;
        this.modified = modified;
        this.categoryId = categoryId;
        this.tags = tags;
        this.createdAt = createdAt;
    }

    public void setId(UUID id){
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }

    public UUID getUserId() {
        return userId;
    }

    public long getModified() {
        return modified;
    }

    public void setModified(long modified) {
        this.modified = modified;
    }

    public UUID getCategoryId() {
        return categoryId;
    }

    public List<UUID> getTags() {
        return tags;
    }

    public long getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }
}

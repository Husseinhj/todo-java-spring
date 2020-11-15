package io.husseinhj.todo.todo.model;

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

    public TodoModel(UUID id,
                     String body,
                     String title,
                     String userId,
                     double modified,
                     UUID categoryId,
                     List<UUID> tags,
                     double createdAt) {
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

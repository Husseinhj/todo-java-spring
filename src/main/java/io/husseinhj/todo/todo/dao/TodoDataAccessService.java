package io.husseinhj.todo.todo.dao;

import io.husseinhj.todo.todo.dao.mapper.TodoMapper;
import io.husseinhj.todo.todo.model.TodoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;
import java.util.*;

@Repository("postgres")
public class TodoDataAccessService implements TodoDao{

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public TodoDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public TodoModel insertTodo(@NotNull TodoModel model) {
        final String query = "INSERT INTO todo " +
                "(id, title, body, createdAt, userId, categoryId, tags, modified)" +
                " VALUES " +
                "(?,?,?,?,?,?,?,?)";

        UUID id = UUID.randomUUID();
        model.setId(id);
        if (model.getCreatedAt() == 0) {
            model.setCreatedAt(System.currentTimeMillis());
        }

        if (model.getModified() == 0) {
            model.setModified(model.getCreatedAt());
        }

        this.jdbcTemplate.update(query,
                model.getId(),
                model.getTitle(),
                model.getBody(),
                model.getCreatedAt(),
                model.getUserId(),
                model.getCategoryId(),
                model.getTags(),
                model.getModified());

        return model;
    }

    @Override
    public List<TodoModel> selectAllTodo() {
        final String query = "SELECT * FROM todo";

        return this.jdbcTemplate.query(query, new TodoMapper());
    }

    @Override
    public Optional<TodoModel> selectTodoById(UUID id) {
        final String query = "SELECT * FROM todo WHERE id = ?";

        TodoModel model = null;
        try {
            model = this.jdbcTemplate.queryForObject(query, new TodoMapper(), id);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }

        return Optional.ofNullable(model);
    }

    @Override
    public List<TodoModel> selectTodoListByUserId(UUID userId) {
        final String query = "SELECT * FROM todo WHERE userId = ?";

        List<TodoModel> todoModels = this.jdbcTemplate.query(query, new TodoMapper(), userId);

        return todoModels;
    }

    @Override
    public UUID deleteTodoById(UUID id) {
        return UUID.randomUUID();
    }

    @Override
    public UUID updateTodoById(UUID id, TodoModel model) {
        return UUID.randomUUID();
    }
}

package io.husseinhj.todo.todo.dao.mapper;

import io.husseinhj.todo.todo.model.TodoModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;


public class TodoMapper implements RowMapper<TodoModel> {

    @Override
    public TodoModel mapRow(ResultSet resultSet, int i) throws SQLException {
        if (resultSet.getString("id") == null) {
            return null;
        }

        UUID id = UUID.fromString(resultSet.getString("id"));
        UUID userId = null;
        UUID categoryId = null;

        if (resultSet.getString("userId") != null) {
            userId = UUID.fromString(resultSet.getString("userId"));
        }

        if (resultSet.getString("categoryId") != null) {
            categoryId = UUID.fromString(resultSet.getString("categoryId"));
        }

        return new TodoModel(
                id,
                resultSet.getString("body"),
                resultSet.getString("title"),
                userId,
                resultSet.getLong("modified"),
                categoryId,
                null,
                resultSet.getLong("createdAt")
        );
    }
}

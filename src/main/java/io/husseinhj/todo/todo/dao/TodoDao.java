package io.husseinhj.todo.todo.dao;

import io.husseinhj.todo.todo.model.TodoModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TodoDao {

    UUID insertTodo(UUID id, TodoModel model);
    default UUID insertTodo(TodoModel model) {
        UUID id = UUID.randomUUID();

        return insertTodo(id, model);
    }

    List<TodoModel> selectAllTodo();
    Optional<TodoModel> selectTodoById(UUID id);

    int deleteTodoById(UUID id);
    int updateTodoById(UUID id, TodoModel model);
}

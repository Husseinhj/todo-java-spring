package io.husseinhj.todo.todo.dao;

import io.husseinhj.todo.todo.model.TodoModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TodoDao {

    TodoModel insertTodo(TodoModel model);

    List<TodoModel> selectAllTodo();

    Optional<TodoModel> selectTodoById(UUID id);
    List<TodoModel> selectTodoListByUserId(UUID userId);

    UUID deleteTodoById(UUID id);
    UUID updateTodoById(UUID id, TodoModel model);
}

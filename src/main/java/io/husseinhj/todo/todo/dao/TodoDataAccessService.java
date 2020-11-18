package io.husseinhj.todo.todo.dao;

import io.husseinhj.todo.todo.model.TodoModel;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class TodoDataAccessService implements TodoDao{
    @Override
    public UUID insertTodo(UUID id, TodoModel model) {
        return UUID.randomUUID();
    }

    @Override
    public List<TodoModel> selectAllTodo() {
        return null;
    }

    @Override
    public Optional<TodoModel> selectTodoById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deleteTodoById(UUID id) {
        return 0;
    }

    @Override
    public int updateTodoById(UUID id, TodoModel model) {
        return 0;
    }
}

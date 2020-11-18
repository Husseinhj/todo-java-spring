package io.husseinhj.todo.todo.service;

import io.husseinhj.todo.todo.dao.TodoDao;
import io.husseinhj.todo.todo.model.TodoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TodoService {
    private final TodoDao todoDao;

    @Autowired
    public TodoService(@Qualifier("postgres") TodoDao todoDao) {
        this.todoDao = todoDao;
    }

    public UUID addTodo(TodoModel todoModel) {
        return this.todoDao.insertTodo(todoModel);
    }

    public List<TodoModel> getAllTodoLists(){
        return this.todoDao.selectAllTodo();
    }

    public Optional<TodoModel> getTodoById(UUID id){
        return this.todoDao.selectTodoById(id);
    }

    public int deleteTodoById(UUID id){
        return this.todoDao.deleteTodoById(id);
    }

    public int updateTodoById(UUID id, TodoModel model) {
        return this.todoDao.updateTodoById(id, model);
    }
}

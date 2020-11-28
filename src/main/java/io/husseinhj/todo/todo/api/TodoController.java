package io.husseinhj.todo.todo.api;

import io.husseinhj.todo.todo.model.TodoModel;
import io.husseinhj.todo.todo.service.TodoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/todo")
public class TodoController {

    private final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public TodoModel addTodo(@RequestBody TodoModel model) {
        return this.todoService.addTodo(model);
    }

    @GetMapping(path = "{id}")
    public Optional<TodoModel> getTodoById(@PathVariable("id") UUID id) {
        return this.todoService.getTodoById(id);
    }

    @GetMapping(path = "user/{userId}")
    public List<TodoModel> getTodoListByUserId(@PathVariable("userId") UUID userId) {
        return this.todoService.getTodoListByUserId(userId);
    }

    @PutMapping(path = "{id}")
    public UUID updateTodo(@PathVariable("id") UUID id, @RequestBody TodoModel model) {
        return this.todoService.updateTodoById(id, model);
    }
}

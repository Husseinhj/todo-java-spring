package io.husseinhj.todo.todo.api;

import io.husseinhj.todo.todo.model.TodoModel;
import io.husseinhj.todo.todo.service.TodoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

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
    public UUID addTodo(@RequestBody TodoModel model) {
        return this.todoService.addTodo(model);
    }
}

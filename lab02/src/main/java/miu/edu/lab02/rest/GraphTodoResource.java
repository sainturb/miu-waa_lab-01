package miu.edu.lab02.rest;

import miu.edu.lab02.dto.TodoDTO;
import miu.edu.lab02.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GraphTodoResource {

    @Autowired
    TodoService todoService;

    @QueryMapping
    public TodoDTO todoById(@Argument Integer id) {
        return todoService.findOne(id);
    }
}

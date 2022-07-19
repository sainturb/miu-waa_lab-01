package miu.edu.lab02.lab02.rest;

import lombok.RequiredArgsConstructor;
import miu.edu.lab02.lab02.dto.TodoDTO;
import miu.edu.lab02.lab02.model.Todo;
import miu.edu.lab02.lab02.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api")
public class TodoResource {

    private final TodoService todoService;

    @GetMapping("todos")
    public List<TodoDTO> getTodos() {
        return todoService.findAll();
    }

    @PostMapping("todos")
    public TodoDTO save(@RequestBody Todo body) {
        return todoService.save(body);
    }

    @PutMapping("todos/{id}")
    public TodoDTO update(@PathVariable Integer id, @RequestBody Todo body) {
        return todoService.update(id, body);
    }

    @GetMapping("todos/{id}")
    public TodoDTO getTodo(@PathVariable Integer id) {
        return todoService.findOne(id);
    }

    @DeleteMapping("todos/{id}")
    public void delete(@PathVariable Integer id) {
        todoService.delete(id);
    }
}

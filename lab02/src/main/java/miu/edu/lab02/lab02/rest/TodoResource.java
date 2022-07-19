package miu.edu.lab02.lab02.rest;

import lombok.RequiredArgsConstructor;
import miu.edu.lab02.lab02.dto.TodoDTO;
import miu.edu.lab02.lab02.model.Todo;
import miu.edu.lab02.lab02.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/todos")
public class TodoResource {

    private final TodoService todoService;

    @GetMapping
    public List<TodoDTO> getTodos() {
        return todoService.findAll();
    }

    @PostMapping
    public TodoDTO save(@RequestBody Todo body) {
        return todoService.save(body);
    }

    @PutMapping("{id}")
    public TodoDTO update(@PathVariable Integer id, @RequestBody Todo body) {
        return todoService.update(id, body);
    }

    @GetMapping("{id}")
    public TodoDTO getTodo(@PathVariable Integer id) {
        return todoService.findOne(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        todoService.delete(id);
    }
}

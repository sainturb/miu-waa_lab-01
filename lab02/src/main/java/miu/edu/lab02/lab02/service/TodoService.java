package miu.edu.lab02.lab02.service;

import lombok.RequiredArgsConstructor;
import miu.edu.lab02.lab02.dto.TodoDTO;
import miu.edu.lab02.lab02.model.Todo;
import miu.edu.lab02.lab02.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;
    public List<TodoDTO> findAll() {
        return todoRepository.findAll().stream().map(todo -> new TodoDTO(todo.getId(), todo.getTitle(), todo.getDesc(), todo.getAssignedTo(), todo.getCreatedDate(), todo.getUpdatedDate())).collect(Collectors.toList());
    }

    public TodoDTO save(Todo todo) {
        todo.setCreatedDate(Instant.now());
        Todo saved = todoRepository.save(todo);
        return new TodoDTO(saved.getId(), saved.getTitle(), saved.getDesc(), saved.getAssignedTo(), saved.getCreatedDate(), saved.getUpdatedDate());
    }

    public TodoDTO update(Integer id, Todo todo) {
        Optional<Todo> updating = todoRepository.findById(id);
        if (updating.isPresent()) {
            updating.get().setTitle(todo.getTitle());
            updating.get().setDesc(todo.getDesc());
            updating.get().setAssignedTo(todo.getAssignedTo());
            updating.get().setUpdatedDate(Instant.now());
            Todo saved = todoRepository.save(updating.get());
            return new TodoDTO(saved.getId(), saved.getTitle(), saved.getDesc(), saved.getAssignedTo(), saved.getCreatedDate(), saved.getUpdatedDate());
        }
        throw new NoSuchElementException("Not found");
    }

    public TodoDTO findOne(Integer id) {
        Optional<Todo> found = todoRepository.findById(id);
        if (found.isPresent())
            return new TodoDTO(found.get().getId(), found.get().getTitle(), found.get().getDesc(), found.get().getAssignedTo(), found.get().getCreatedDate(), found.get().getUpdatedDate());
        throw new NoSuchElementException("Not found");
    }

    public void delete(Integer id) {
        todoRepository.deleteById(id);
    }
}

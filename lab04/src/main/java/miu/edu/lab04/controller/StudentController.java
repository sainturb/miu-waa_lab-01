package miu.edu.lab04.controller;

import lombok.RequiredArgsConstructor;
import miu.edu.lab04.dto.StudentDTO;
import miu.edu.lab04.model.Student;
import miu.edu.lab04.service.StudentServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentServiceImpl service;

    private final ModelMapper mapper;

    @GetMapping
    public List<StudentDTO> getAll() {
        return service.getAll()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDTO> getById(@PathVariable Long id) {
        return service.getById(id)
                .map(this::toDTO)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PostMapping
    public StudentDTO save(@RequestBody Student student) {
        return this.toDTO(service.save(student));
    }

    @PutMapping("/{id}")
    public StudentDTO update(@PathVariable Long id, @RequestBody Student student) {
        student.setId(id);
        return this.toDTO(service.save(student));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    private StudentDTO toDTO(Student student) {
        return mapper.map(student, StudentDTO.class);
    }

    private Student toEntity(StudentDTO student) {
        return mapper.map(student, Student.class);
    }
}

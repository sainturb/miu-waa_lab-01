package miu.edu.lab03.controller;

import lombok.RequiredArgsConstructor;
import miu.edu.lab03.dto.FacultyDTO;
import miu.edu.lab03.model.Faculty;
import miu.edu.lab03.service.FacultyServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/faculties")
@RequiredArgsConstructor
public class FacultyController {
    private final FacultyServiceImpl service;

    private final ModelMapper mapper;

    @GetMapping
    public List<FacultyDTO> getAll() {
        return service.getAll()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FacultyDTO> getById(@PathVariable Long id) {
        return service.getById(id)
                .map(this::toDTO)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PostMapping
    public FacultyDTO save(@RequestBody Faculty faculty) {
        return this.toDTO(service.save(faculty));
    }

    @PutMapping("/{id}")
    public FacultyDTO update(@PathVariable Long id, @RequestBody Faculty faculty) {
        faculty.setId(id);
        return this.toDTO(service.save(faculty));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    private FacultyDTO toDTO(Faculty faculty) {
        return mapper.map(faculty, FacultyDTO.class);
    }

    private Faculty toEntity(FacultyDTO faculty) {
        return mapper.map(faculty, Faculty.class);
    }
}

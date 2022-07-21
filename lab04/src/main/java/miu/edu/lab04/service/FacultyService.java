package miu.edu.lab04.service;

import miu.edu.lab04.model.Faculty;

import java.util.List;
import java.util.Optional;

public interface FacultyService {
    List<Faculty> getAll();
    Optional<Faculty> getById(Long id);
    Faculty save(Faculty faculty);
    void delete(Long id);
}

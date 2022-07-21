package miu.edu.lab03.service;

import miu.edu.lab03.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAll();
    Optional<Student> getById(Long id);
    Student save(Student product);
    void delete(Long id);
}

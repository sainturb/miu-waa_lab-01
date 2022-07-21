package miu.edu.lab04.service;

import lombok.RequiredArgsConstructor;
import miu.edu.lab04.model.Student;
import miu.edu.lab04.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    @Override
    public List<Student> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Student> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Student save(Student product) {
        return repository.save(product);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
    
}

package miu.edu.lab04.service;

import lombok.RequiredArgsConstructor;
import miu.edu.lab04.model.Faculty;
import miu.edu.lab04.repository.FacultyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FacultyServiceImpl implements FacultyService {

    private final FacultyRepository repository;

    @Override
    public List<Faculty> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Faculty> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Faculty save(Faculty faculty) {
        return repository.save(faculty);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

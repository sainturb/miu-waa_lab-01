package miu.edu.lab05.service;

import miu.edu.lab05.models.Course;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{
    @Override
    public List<Course> getAll() {
        return null;
    }

    @Override
    public Optional<Course> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public Course save(Course course) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}

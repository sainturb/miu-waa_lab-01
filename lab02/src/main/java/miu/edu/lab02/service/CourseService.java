package miu.edu.lab02.service;

import miu.edu.lab02.model.Course;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public interface CourseService {
    List<Course> findAll();

    Course save(Course course);

    Course update(Integer id, Course course);

    Course findOne(Integer id);

    void delete(Integer id);
}

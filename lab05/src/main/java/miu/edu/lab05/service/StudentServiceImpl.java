package miu.edu.lab05.service;

import miu.edu.lab05.ExecutionTime;
import miu.edu.lab05.HelloWorld;
import miu.edu.lab05.models.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @HelloWorld
    @ExecutionTime
    @Override
    public List<Student> getAll() {
        System.out.println("all students");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Optional<Student> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}

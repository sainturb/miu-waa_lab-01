package miu.edu.lab04.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@DiscriminatorValue("student")
public class Student extends Person {
    private Double gpa;
}

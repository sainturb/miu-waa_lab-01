package miu.edu.lab04.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@DiscriminatorValue("faculty")
public class Faculty extends Person {
   private Double salary;
}

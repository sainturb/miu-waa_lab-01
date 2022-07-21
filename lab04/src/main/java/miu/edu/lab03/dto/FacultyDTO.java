package miu.edu.lab03.dto;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
public class FacultyDTO extends PersonDTO {
   private Double salary;
}

package miu.edu.lab03.dto;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.InheritanceType.SINGLE_TABLE;

@Data
public abstract class PersonDTO {
    private Long id;
    private String firstname;
    private String lastname;
}

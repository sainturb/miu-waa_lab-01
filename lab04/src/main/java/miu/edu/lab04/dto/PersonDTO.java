package miu.edu.lab04.dto;

import lombok.Data;

@Data
public abstract class PersonDTO {
    private Long id;
    private String firstname;
    private String lastname;
}

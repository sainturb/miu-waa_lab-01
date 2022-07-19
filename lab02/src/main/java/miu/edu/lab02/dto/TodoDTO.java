package miu.edu.lab02.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
@Data
@Getter
@Setter
@AllArgsConstructor
public class TodoDTO {
    private Integer id;
    private String title;
    private String desc;
    private String assignedTo;
    private Instant createdDate;
    private Instant updatedDate;
}

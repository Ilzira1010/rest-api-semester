package ru.itis.restapidemosemester.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class TrainingForm {
    private String name;
    private Boolean status;
    private String coachName;
}

package ru.itis.restapidemosemester.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import ru.itis.restapidemosemester.models.Training;


import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@Getter
@Setter
public class TrainingDto {
    private Long id;
    private String name;
    private Boolean status;
    private String coachName;
    private Long coachId;

    public static TrainingDto from(Training training) {
        return TrainingDto.builder()
                .id(training.getId())
                .name(training.getName())
                .status(training.getStatus())
                .coachId(training.getCoach().getId())
                .coachName(training.getCoach().getName())
                .build();

    }

    public static List<TrainingDto> from(List<Training> sites) {
        return sites.stream().map(TrainingDto::from).collect(Collectors.toList());
    }
}

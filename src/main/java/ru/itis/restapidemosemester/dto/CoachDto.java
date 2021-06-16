package ru.itis.restapidemosemester.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import ru.itis.restapidemosemester.models.Coach;

import java.util.List;
import java.util.stream.Collectors;

@Builder
@Data
@Getter
@Setter
public class CoachDto {
    private Long id;

    private String name;


    public static CoachDto from(Coach coach) {
        return CoachDto.builder()
                .id(coach.getId())
                .name(coach.getName())
                .build();


    }

    public static List<CoachDto> from(List<Coach> coaches) {
        return coaches.stream().map(CoachDto::from).collect(Collectors.toList());
    }

}

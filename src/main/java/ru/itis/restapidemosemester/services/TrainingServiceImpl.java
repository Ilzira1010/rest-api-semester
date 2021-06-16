package ru.itis.restapidemosemester.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ru.itis.restapidemosemester.dto.TrainingDto;
import ru.itis.restapidemosemester.dto.TrainingForm;
import ru.itis.restapidemosemester.models.Coach;
import ru.itis.restapidemosemester.models.Training;
import ru.itis.restapidemosemester.repositoriers.CoachRepository;
import ru.itis.restapidemosemester.repositoriers.TrainingRepository;


import java.util.List;

@Component
public class TrainingServiceImpl implements TrainingsService {

    @Autowired
    TrainingRepository trainingRepository;
    @Autowired
    CoachRepository coachRepository;


    @Override
    public List<TrainingDto> getAllTraining() {
        return TrainingDto.from(trainingRepository.findAll());
    }

    @Override
    public Training addTraining(TrainingForm trainingForm) {
        if (!coachRepository.getByName(trainingForm.getCoachName()).isPresent()) {
            coachRepository.save(Coach.builder()
                    .name(trainingForm.getCoachName())
                    .build());
        }
        Coach coach = coachRepository.getByName(trainingForm.getCoachName()).get();
        return trainingRepository.save(Training.builder()
                .name(trainingForm.getName())
                .status(trainingForm.getStatus())
                .coach(coach)
                .build());
    }
}
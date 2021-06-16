package ru.itis.restapidemosemester.services;

import ru.itis.restapidemosemester.dto.TrainingDto;
import ru.itis.restapidemosemester.dto.TrainingForm;
import ru.itis.restapidemosemester.models.Training;

import java.util.List;

public interface TrainingsService {
    List<TrainingDto> getAllTraining();

    Training addTraining(TrainingForm site);
}
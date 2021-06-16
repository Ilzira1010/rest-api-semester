package ru.itis.restapidemosemester.controllers;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.itis.restapidemosemester.dto.TrainingDto;
import ru.itis.restapidemosemester.dto.TrainingForm;
import ru.itis.restapidemosemester.models.Training;
import ru.itis.restapidemosemester.services.TrainingsService;

import java.util.List;

@RestController
public class TrainingController {

    @Autowired
    private TrainingsService trainingsService;

    @CrossOrigin(origins = "http://localhost")
    @GetMapping("/sites")
    public ResponseEntity<List<TrainingDto>> getAllTraning() {
        return ResponseEntity.ok(trainingsService.getAllTraining());
    }

    @CrossOrigin(origins = "http://localhost")
    @ApiOperation(value = "Добавление тренеровки")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Успешно добавлено", response = TrainingDto.class)})
    @PostMapping("/sites")
    public ResponseEntity<Training> addCourse(@RequestBody TrainingForm trainingForm) {
        return ResponseEntity.ok(trainingsService.addTraining(trainingForm));
    }

}

package ru.itis.restapidemosemester.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.restapidemosemester.dto.CoachDto;
import ru.itis.restapidemosemester.services.CoachService;

@RestController
public class CoachController {

    @Autowired
    CoachService coachService;

    @CrossOrigin(origins = "http://localhost")
    @GetMapping("/users/{id}")
    public ResponseEntity<CoachDto> getTeachers(@PathVariable("id") Long coachId) {
        return ResponseEntity.ok(coachService.getCoach(coachId));
    }

}

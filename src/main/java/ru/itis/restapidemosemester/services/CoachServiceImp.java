package ru.itis.restapidemosemester.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.itis.restapidemosemester.dto.CoachDto;
import ru.itis.restapidemosemester.models.Coach;
import ru.itis.restapidemosemester.repositoriers.CoachRepository;



@Service
@Component
public class CoachServiceImp implements CoachService{

    @Autowired
    CoachRepository repository;


    @Override
    public CoachDto getCoach(Long coachId) {
        Coach coach = repository.getById(coachId);
        return CoachDto.from(coach);
    }
}

package ru.itis.restapidemosemester.services;


import ru.itis.restapidemosemester.dto.CoachDto;


public interface CoachService {
    CoachDto getCoach(Long coachId);
}

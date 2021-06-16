package ru.itis.restapidemosemester.repositoriers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itis.restapidemosemester.models.Training;

@Repository
public interface TrainingRepository extends JpaRepository<Training, Long> {
}

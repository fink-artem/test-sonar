package ru.test.repository;

import org.springframework.data.repository.CrudRepository;
import ru.test.entity.CarEntity;

public interface CarRepository extends CrudRepository<CarEntity, Integer> {
}

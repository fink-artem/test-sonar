package ru.test.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.test.entity.CarEntity;
import ru.test.mapper.CarEntityMapper;
import ru.test.model.Car;
import ru.test.repository.CarRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor
public class CarService {

    private final CarRepository carRepository;
    private final CarEntityMapper carEntityMapper;

    public List<Car> getCars() {
        Iterable<CarEntity> carEntities = carRepository.findAll();
        return carEntityMapper.carEntityToCar(carEntities);
    }

    public Car getCar(Integer id) {
        Optional<CarEntity> carEntity = carRepository.findById(id);
        return carEntity.map(carEntityMapper::carEntityToCar).orElse(null);
    }

    @Transactional
    void doNothing() {
        log.info("test");
    }
}

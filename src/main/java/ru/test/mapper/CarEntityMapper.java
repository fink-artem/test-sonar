package ru.test.mapper;

import org.mapstruct.Mapper;
import ru.test.entity.CarEntity;
import ru.test.model.Car;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarEntityMapper {

    CarEntity carToCarEntity(Car car);

    Car carEntityToCar(CarEntity carEntity);

    List<Car> carEntityToCar(Iterable<CarEntity> carEntity);

}

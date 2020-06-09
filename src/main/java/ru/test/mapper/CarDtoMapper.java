package ru.test.mapper;

import org.mapstruct.Mapper;
import ru.test.dto.CarDto;
import ru.test.model.Car;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarDtoMapper {

    CarDto carToCarDto(Car car);

    Car carDtoToCar(CarDto carDto);

    List<CarDto> carToCarDto(List<Car> cars);
}

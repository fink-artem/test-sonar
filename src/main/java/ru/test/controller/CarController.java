package ru.test.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.test.dto.CarDto;
import ru.test.mapper.CarDtoMapper;
import ru.test.model.Car;
import ru.test.service.CarService;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;
    @Autowired
    private CarDtoMapper carDtoMapper;

    @GetMapping
    public List<CarDto> getCars() {
        List<Car> cars = carService.getCars();
        return carDtoMapper.carToCarDto(cars);
    }

    @GetMapping(value = "/{id}")
    public CarDto getCar(@PathVariable Integer id) {
        Car car = carService.getCar(id);
        return carDtoMapper.carToCarDto(car);
    }

}

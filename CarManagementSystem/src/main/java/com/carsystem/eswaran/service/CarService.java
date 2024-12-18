package com.carsystem.eswaran.service;

import com.carsystem.eswaran.entity.Car;

import org.springframework.data.domain.Page;
import java.util.List;
import java.util.Optional;

public interface CarService {

    Car saveCar(Car car);

    List<Car> saveMultipleCars(List<Car> cars);

    Page<Car> getAllCars(int page, int size, String sortBy, String direction);

    Optional<Car> getCarById(Long id);

    void deleteCar(Long id);

    List<Car> searchCars(String name, String model, Integer year, String color, String fuelType);

    Car updateCar(Long id, Car car);

    List<Car> globalSearch(String name, String model, Integer year, String color, String fuelType);
}

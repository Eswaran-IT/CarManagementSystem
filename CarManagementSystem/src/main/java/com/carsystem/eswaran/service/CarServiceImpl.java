package com.carsystem.eswaran.service;

import com.carsystem.eswaran.entity.Car;
import com.carsystem.eswaran.repo.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public List<Car> saveMultipleCars(List<Car> cars) {
        return carRepository.saveAll(cars);
    }

    @Override
    public Page<Car> getAllCars(int page, int size, String sortBy, String direction) {
        Sort sort = Sort.by(Sort.Order.by(sortBy));
        if ("DESC".equalsIgnoreCase(direction)) {
            sort = sort.descending();
        }
        return carRepository.findAll(PageRequest.of(page, size, sort));
    }

    @Override
    public Optional<Car> getCarById(Long id) {
        return carRepository.findById(id);
    }

    @Override
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }

    @Override
    public List<Car> searchCars(String name, String model, Integer year, String color, String fuelType) {
        if (name != null && !name.isEmpty()) {
            return carRepository.findAllByNameContainingIgnoreCase(name);
        } else if (model != null && !model.isEmpty()) {
            return carRepository.findAllByModelContainingIgnoreCase(model);
        } else if (year != null) {
            return carRepository.findAllByYear(year);
        } else if (color != null && !color.isEmpty()) {
            return carRepository.findAllByColorContainingIgnoreCase(color);
        } else if (fuelType != null && !fuelType.isEmpty()) {
            return carRepository.findAllByFuelTypeContainingIgnoreCase(fuelType);
        }
        return carRepository.findAll();
    }

    @Override
    public Car updateCar(Long id, Car car) {
        if (carRepository.existsById(id)) {
            car.setId(id);
            return carRepository.save(car);
        }
        return null;
    }

    @Override
    public List<Car> globalSearch(String name, String model, Integer year, String color, String fuelType) {
        return carRepository.findAll();
    }
}

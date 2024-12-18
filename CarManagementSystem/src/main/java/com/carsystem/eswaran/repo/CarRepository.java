package com.carsystem.eswaran.repo;

import com.carsystem.eswaran.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findAllByNameContainingIgnoreCase(String name);
    List<Car> findAllByModelContainingIgnoreCase(String model);
    List<Car> findAllByYear(Integer year);
    List<Car> findAllByColorContainingIgnoreCase(String color);
    List<Car> findAllByFuelTypeContainingIgnoreCase(String fuelType);
}

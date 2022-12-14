package com.valtech.spring.boot.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.spring.boot.entity.Car;
import com.valtech.spring.boot.service.CarService;

@RestController

public class CarRestController {
@Autowired

private CarService carservice;

@PutMapping("/api/cars/{id}")
public Car updateCar(@RequestBody Car car,@PathVariable("id") int id){
    car.setId(id);
    return carservice.updateCar(car);
}
@PostMapping("api/cars")
public Car createCar(@RequestBody Car car) {
	 return carservice.createCar(car);
}

@GetMapping("api/cars")
public List<Car> getCars() {
	 return carservice.getAllCars();
}

@GetMapping("/rest/cars/{id}")    
public Car getCar(@PathVariable("id")int id){
      return carservice.getCar(id);
}



}
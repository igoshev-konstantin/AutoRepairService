package myApplication.controller;


import myApplication.entity.Car;
import myApplication.entity.CarColor;
import myApplication.entity.CarLabel;
import myApplication.exceptionHandling.NoSuchCarException;
import myApplication.service.CarPropertiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainRestController {
/**/
    @Autowired
    private CarPropertiesService carPropertiesService;

    @GetMapping("/allCarLabels")           /*http://localhost:8080/api/allCarLabels*/
    public List<CarLabel> getAllCarLabels() {
        List<CarLabel> carLabels = carPropertiesService.getAllCarLabels();
        return carLabels;
    }

    @GetMapping("/allCarColors")           /*http://localhost:8080/api/allCarColors*/
    public List<CarColor> getAllCarColors() {
        List<CarColor> carColors = carPropertiesService.getAllCarColors();
        return carColors;
    }

    @GetMapping("/allCars")           /*http://localhost:8080/api/allCars*/
    public List<Car> getAllCars() {
        List<Car> cars = carPropertiesService.getAllCars();
        return cars;
    }

    @GetMapping("/allCars/{id}")          /*http://localhost:8080/api/allCars/1/*/
    public Car getEmployeeById(@PathVariable("id") int id) {
        Car car = carPropertiesService.getCarById(id);
        if (car == null) {
            throw new NoSuchCarException("there is no car with id: " + id);
        }
        return car;
    }


    @PostMapping("/cars")      /*Добавляем Car. Данные отправляем в формате JSON,
    jaxon конвертирует это из JSON в объект Car. Затем записывает в БД новую car и присваевает
    car id.*/
    public Car addNewEmployeeByPOST(@RequestBody Car car) {
        carPropertiesService.saveCar(car);
        return car;
    }

    @PutMapping("/cars")          /* PutMapping обновляет данные по car*/
    public Car updateEmployee(@RequestBody Car car) {
        carPropertiesService.saveCar(car);
        return car;
    }


    @DeleteMapping("/cars/{id}")
    public String deleteEmployee(@PathVariable("id") int id) {

        Car car = carPropertiesService.getCarById(id);
        if (car == null) {
            throw new NoSuchCarException("there is no car with id: " + id);
        }else{
            carPropertiesService.deleteCarById(id);
        }

        return "car with id: " + id + " id - was deleted";
    }

}

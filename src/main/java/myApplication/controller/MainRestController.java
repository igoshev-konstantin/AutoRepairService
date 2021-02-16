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
            throw new NoSuchCarException("there is no employee with id: " + id);
        }
        return car;
    }

//    @PostMapping("/employees")      Добавляем сотрудника. Данные отправляем в формате JSON
//    jaxon конвертирует это из JSON в объект Employee. Затем записывает в БД нового сотрудника и присваевает
//    сотруднику id.
//    public Employee addNewEmployeeByPOST(@RequestBody Employee employee) {
//        employeeService.saveEmployee(employee);
//        return employee;
//    }
//
//    @PutMapping("/employees")           PutMapping обновляет данные по сотруднику
//    public Employee updateEmployee(@RequestBody Employee employee) {
//        employeeService.saveEmployee(employee);
//        return employee;
//    }
//
//    @DeleteMapping("/employee/{id}")
//    public String deleteEmployee(@PathVariable("id") int id) {
//
//        Employee employee = employeeService.getEmployee(id);
//        if (employee == null) {
//            throw new NoSuchEmployeeException("there is no employee with id: " + id);
//        }else{
//            employeeService.deleteEmployee(id);
//        }
//
//        return "Employee with id: " + id + " id - was deleted";
//    }

}

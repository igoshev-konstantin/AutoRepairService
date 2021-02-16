package myApplication.service;


import myApplication.dao.CarPropertiesDAO;
import myApplication.entity.Car;
import myApplication.entity.CarColor;
import myApplication.entity.CarLabel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarPropertiesServiceImpl implements CarPropertiesService {

    @Autowired
    private CarPropertiesDAO carPropertiesDAO;

    @Override
    @Transactional
    public List<CarLabel> getAllCarLabels() {
        return carPropertiesDAO.getAllCarLabels();
    }

    @Override
    @Transactional
    public List<CarColor> getAllCarColors() {
        return carPropertiesDAO.getAllCarColors();
    }

    @Override
    public Car getCarById(int id) {
        return carPropertiesDAO.getCarById(id);
    }

    @Override
    public List<Car> getAllCars() {
        return carPropertiesDAO.getAllCars();
    }

    @Override
    @Transactional
    public void saveCar(Car car) {
        carPropertiesDAO.saveCar(car);
    }
}

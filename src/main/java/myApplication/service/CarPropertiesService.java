package myApplication.service;


import myApplication.entity.Car;
import myApplication.entity.CarColor;
import myApplication.entity.CarLabel;

import java.util.List;

public interface CarPropertiesService {
    public List<CarLabel> getAllCarLabels();

    public List<CarColor> getAllCarColors();

    public void saveCar(Car car);
}

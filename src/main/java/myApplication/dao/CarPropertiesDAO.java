package myApplication.dao;



import myApplication.entity.Car;
import myApplication.entity.CarColor;
import myApplication.entity.CarLabel;

import java.util.List;

public interface CarPropertiesDAO {

    public List<CarLabel> getAllCarLabels();

    public List<CarColor> getAllCarColors();

    public List<Car> getAllCars();

    public Car getCarById(int id);

    public void saveCar(Car car);

    public void deleteCarById(int id);
}

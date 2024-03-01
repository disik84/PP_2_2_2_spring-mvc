package web.service;

import java.util.List;

import web.model.Car;

public interface CarService {
    List<Car> showCar(Integer count, List<Car> list);

}

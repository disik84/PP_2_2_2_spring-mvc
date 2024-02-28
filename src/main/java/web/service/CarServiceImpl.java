package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> showCar(Integer count, List<Car> list) {
        return list.subList(0, count);
    }
}

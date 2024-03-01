package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> listCar = new ArrayList<>();

    public List<Car> getListCar() {
        return listCar;
    }

    @Override
    public List<Car> showCar(Integer count, List<Car> list) {
        return list.subList(0, count);
    }

    public void addCar() {
        Car car1 = new Car("BMW", 5, "желтый");
        Car car2 = new Car("Mazda", 6, "зеленый");
        Car car3 = new Car("Audi", 100, "черный");
        Car car4 = new Car("Mercedes", 600, "красный");
        Car car5 = new Car("Volvo", 70, "белый");
        this.listCar.add(car1);
        this.listCar.add(car2);
        this.listCar.add(car3);
        this.listCar.add(car4);
        this.listCar.add(car5);
    }

}

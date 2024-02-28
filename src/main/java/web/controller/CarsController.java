package web.controller;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        List<Car> listCar = new ArrayList<>();
        CarServiceImpl carService = new CarServiceImpl();
        Car car1 = new Car("BMW", 5, "желтый");
        Car car2 = new Car("Mazda", 6, "зеленый");
        Car car3 = new Car("Audi", 100, "черный");
        Car car4 = new Car("Mercedes", 600, "красный");
        Car car5 = new Car("Volvo", 70, "белый");
        listCar.add(car1);
        listCar.add(car2);
        listCar.add(car3);
        listCar.add(car4);
        listCar.add(car5);
        if (count == null || count >= 5) {
            count = 5;
        }
        model.addAttribute("listCar", carService.showCar(count, listCar));
        return "index_cars";
    }

}
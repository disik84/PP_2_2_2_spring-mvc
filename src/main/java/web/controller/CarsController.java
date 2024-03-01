package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

    private CarServiceImpl carService;

    @Autowired
    public void setCarService(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {

        carService.addCar();

        if (count == null || count >= 5) {
            count = 5;
        }
        model.addAttribute("listCar", carService.showCar(count, carService.getListCar()));
        return "index_cars";
    }

}
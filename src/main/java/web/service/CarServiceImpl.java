package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Nissan", "Red", 523));
        cars.add(new Car("Toyota", "Grey", 798));
        cars.add(new Car("BMW", "Pink", 264));
        cars.add(new Car("Haval", "Blue", 938));
        cars.add(new Car("Hyundai", "Orange", 177));
    }

    @Override
    public List<Car> getCarsByCount(int n) {
        if (n <= 0 || n >= 5) {
            return cars;
        } else {
            return new ArrayList<>(cars.subList(0, n));
        }
    }
}

package com.bamioezequiel.automovilapp.logica;

import com.bamioezequiel.automovilapp.persistencia.ControllerPersistence;
import java.util.List;

public class Controller {
    ControllerPersistence controllerPersistence = new ControllerPersistence();
    
    public void createCar(String brand, String color, String engiene, String model, String pantent, int doors) {
        Car car = new Car();
        car.setBrand(brand);
        car.setColor(color);
        car.setEngiene(engiene);
        car.setModel(model);
        car.setPantent(pantent);
        car.setDoors(doors);
        
        controllerPersistence.create(car);
    }

    public List<Car> getCars() {
        return controllerPersistence.getCars();
    }

    public void deleteCar(int id_car) throws Exception {
        controllerPersistence.deleteCar(id_car);
    }

    public Car findCar(int id_car) {
        return controllerPersistence.findCar(id_car);
    }

    public void updateCar(Car car) throws Exception {
        controllerPersistence.updateCar(car);
    }
}

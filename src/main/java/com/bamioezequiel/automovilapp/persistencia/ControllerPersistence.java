package com.bamioezequiel.automovilapp.persistencia;

import com.bamioezequiel.automovilapp.logica.Car;
import java.util.List;

public class ControllerPersistence {
    CarJpaController carJpa = new CarJpaController();
    
    public void create(Car car) {
        carJpa.create(car);
    }

    public List<Car> getCars() {
        return carJpa.findCarEntities();
    }

    public void deleteCar(int id_car) throws Exception {
        carJpa.destroy(id_car);
    }

    public Car findCar(int id_car) {
        return carJpa.findCar(id_car);
    }
    
    public void updateCar(Car car) throws Exception {
        carJpa.edit(car);
    }
}

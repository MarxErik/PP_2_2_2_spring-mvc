package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> carList = new ArrayList<>();
    {
        carList.add(null);
        carList.add(new Car("car1", "engine1", 1000));
        carList.add(new Car("car2", "engine2", 2000));
        carList.add(new Car("car3", "engine3", 3000));
        carList.add(new Car("car4", "engine4", 4000));
        carList.add(new Car("car5", "engine5", 5000));
    }

    @Override
    public List<Car> getCarList() {
        return carList;
    }
}

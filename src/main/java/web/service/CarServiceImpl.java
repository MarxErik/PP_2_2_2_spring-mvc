package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao carDao;
    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCarList(int count) {
        List<Car> resultList = new ArrayList<>();
        List<Car> carList = carDao.getCarList(count);
        for (Car car : carList) {
            if (car != null) {
                resultList.add(car);
                if (resultList.size() == count) {
                    break;
                }
            }
        }
        return resultList;
    }
}

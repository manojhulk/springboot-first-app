package com.fullstack.springbootfirstapp.service.Impl;

import com.fullstack.springbootfirstapp.dao.CarDao;
import com.fullstack.springbootfirstapp.model.Cars;
import com.fullstack.springbootfirstapp.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    CarDao carDao;
    @Override
    public List<Cars> getCars(LocalDate start, LocalDate end,String model) {
        List<Cars> c1= carDao.getCars(start, end,model);
        return c1;

    }

    @Override
    public void updateCar(String veh, LocalDate start, LocalDate end) {
        carDao.updateCar(veh, start, end);
    }

    @Override
    public List<Cars> getCarsByOrder(int num,String order,String model) {
        List<Cars> c2 = carDao.getCarsByOrder(num,order,model);
        return c2;
    }

}

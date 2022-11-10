package com.fullstack.springbootfirstapp.service.Impl;

import com.fullstack.springbootfirstapp.dao.CarDao;
import com.fullstack.springbootfirstapp.model.Cars;
import com.fullstack.springbootfirstapp.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

public class CarServiceImpl implements CarService {
    @Autowired
    CarDao carDao;
    @Override
    public List<Cars> getCars(LocalDate start, LocalDate end, String model) {
        List<Cars> c1= carDao.getCars(start, end, model);
        return c1;

    }
}

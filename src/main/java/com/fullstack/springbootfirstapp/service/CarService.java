package com.fullstack.springbootfirstapp.service;

import com.fullstack.springbootfirstapp.model.Cars;

import java.time.LocalDate;
import java.util.List;

public interface CarService {
    List<Cars> getCars(LocalDate start, LocalDate end,String model);

    void updateCar(String veh, LocalDate start, LocalDate end);
    List<Cars> getCarsByOrder(int num,String order,String model);
}

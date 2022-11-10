package com.fullstack.springbootfirstapp.dao;

import com.fullstack.springbootfirstapp.model.Cars;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface CarDao {
    List<Cars> getCars(LocalDate start, LocalDate end, String model);
}

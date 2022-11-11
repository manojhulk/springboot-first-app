package com.fullstack.springbootfirstapp.service;

import com.fullstack.springbootfirstapp.model.Bookings;

import java.time.LocalDate;

public interface BookingsService {
    void saveData(String registerId, String uname, String veh, LocalDate start, LocalDate end);
    Bookings getByNum(String registerId, String veh);
}

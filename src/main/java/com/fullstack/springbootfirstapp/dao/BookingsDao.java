package com.fullstack.springbootfirstapp.dao;

import com.fullstack.springbootfirstapp.model.Bookings;

import java.time.LocalDate;

public interface BookingsDao {
    void saveData(String registerId, String uname, String veh, LocalDate start, LocalDate end);
    Bookings getByNum(String registerId,String veh);
}

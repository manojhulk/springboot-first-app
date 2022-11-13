package com.fullstack.springbootfirstapp.service.Impl;

import com.fullstack.springbootfirstapp.dao.BookingsDao;
import com.fullstack.springbootfirstapp.model.Bookings;
import com.fullstack.springbootfirstapp.service.BookingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class BookingServiceImpl implements BookingsService {
    @Autowired
    BookingsDao bookingsDao;
    @Override
    public void saveData(String registerId, String uname, String veh, LocalDate start, LocalDate end) {
        bookingsDao.saveData(registerId,uname,veh,start,end);

    }

    @Override
    public Bookings getByNum(String registerId) {
        Bookings bookings=bookingsDao.getByNum(registerId);
        return bookings;
    }
}

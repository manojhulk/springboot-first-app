package com.fullstack.springbootfirstapp.dao.Impl;

import com.fullstack.springbootfirstapp.dao.CarDao;
import com.fullstack.springbootfirstapp.model.Cars;
import com.fullstack.springbootfirstapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Repository
public class CarDaoImpl extends JdbcDaoSupport implements CarDao {
    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }
    @Override
    public List<Cars> getCars(LocalDate start, LocalDate end) {

        String sql = "select * from prime ";
        List<Cars> customers = new ArrayList<>();
        List<Map<String, Object>> list = getJdbcTemplate().queryForList(sql);
        for (Map<String, Object> map : list) {
            Cars car = new Cars();
            car.setCarname((String)map.get("vehicletitle"));
            car.setSeats((Integer)map.get("Seating"));
            car.setPrice((Integer)map.get("PricePerDay"));
            car.setFuelType((String) map.get("FuelType"));

            customers.add(car);
        }
        return customers;
    }

    @Override
    public void updateCar(String veh, LocalDate start, LocalDate end) {
        int stat=0;
        String sql_update="update prime set status=?,RegDate=?,UpdationDate=? where vehicletitle=?;";
        getJdbcTemplate().update(sql_update,stat,start,end,veh);
    }
}


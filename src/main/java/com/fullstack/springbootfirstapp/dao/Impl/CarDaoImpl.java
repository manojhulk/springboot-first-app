package com.fullstack.springbootfirstapp.dao.Impl;

import com.fullstack.springbootfirstapp.dao.CarDao;
import com.fullstack.springbootfirstapp.model.Cars;
import com.fullstack.springbootfirstapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

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

public class CarDaoImpl extends JdbcDaoSupport implements CarDao {
    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }
    @Override
    public List<Cars> getCars(LocalDate start, LocalDate end, String model) {

        String sql = "select * from prime where RegDate<=? and UpdationDate>=?";
        List<Cars> result= new ArrayList<>();
        List<Map<String,Object>> query=getJdbcTemplate().queryForList(sql,start,end);
        for(Map<String,Object> map: query){
            Cars cars= new Cars();
            cars.setPrice((Integer)map.get("PricePerDay"));
            cars.setCarname((String)map.get("vehicletitle"));
            cars.setFuelType((String) map.get("FuelType"));
            cars.setSeats((Integer)map.get("Seating"));
            result.add(cars);
        }
        return result;
    }
}

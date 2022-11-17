package com.fullstack.springbootfirstapp.dao.Impl;

import com.fullstack.springbootfirstapp.dao.BookingsDao;
import com.fullstack.springbootfirstapp.model.Bookings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
@Repository
public class BookingsDaoImpl extends JdbcDaoSupport implements BookingsDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    @Override
    public void saveData(String registerId, String uname, String veh, LocalDate start, LocalDate end) {
        String sql_insert="insert into booking(regisid,person,vehicletitle,pick,returns) values(?,?,?,?,?)";
        getJdbcTemplate().update(sql_insert,new Object[]{registerId,uname,veh,start,end});
    }

    @Override
    public Bookings getByNum(String registerId) {
        String sql_select="select b.regisid,b.person,b.vehicletitle,p.PricePerDay,p.Seating,b.pick,b.returns from prime p, booking b where b.regisid=? and p.vehicletitle=b.vehicletitle";
        return getJdbcTemplate().queryForObject(sql_select, new Object[]{registerId}, new RowMapper<Bookings>() {
            @Override
            public Bookings mapRow(ResultSet rs, int rowNum) throws SQLException {
                Bookings book = new Bookings();
                book.setRegister(registerId);
                book.setVehicletitle(rs.getString(3));
                book.setPerson(rs.getString(2));
                book.setPrice(rs.getString(4));
                book.setPick(rs.getDate(6).toLocalDate());
                book.setRetcar(rs.getDate(7).toLocalDate());
                book.setSeating((rs.getInt(5)));
                return book;
            }
        });
    }
}

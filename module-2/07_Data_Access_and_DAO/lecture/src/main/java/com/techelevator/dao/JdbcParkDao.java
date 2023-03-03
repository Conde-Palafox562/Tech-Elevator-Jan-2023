package com.techelevator.dao;

import com.techelevator.model.Park;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcParkDao implements ParkDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcParkDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Park getPark(int parkId) {


        //Step 2 - write out your sql in pg admin and then save it to a variable here
        // in tinellij. Make sure that any variables
        String sql = "SELECT park_id, park_name, date_established, area, has_camping\n" +
                    "FROM park" +
                    "WHERE park_id = ?;";
        return new Park();
    }

    @Override
    public List<Park> getParksByState(String stateAbbreviation) {
        return new ArrayList<Park>();
    }

    @Override
    public Park createPark(Park park) {

        // Step 1: Declare the variable that we want to return

        // Don't really need this because we are already receiving a park as a parameter
        // and we can also just pull the park we create from the database
        // Park park = null;


        // Step 2 - Create the sql we want to run on the database
        String sql = "INSERT INTO park (park_name, date_established, area, has_camping)\n" +
                        "VALUES(?, ?, ?, ?);";

        return new Park();
    }

    @Override
    public void updatePark(Park park) {

    }

    @Override
    public void deletePark(int parkId) {

    }

    @Override
    public void addParkToState(int parkId, String stateAbbreviation) {

    }

    @Override
    public void removeParkFromState(int parkId, String stateAbbreviation) {

    }

    private Park mapRowToPark(SqlRowSet rowSet) {

        return new Park();
    }
}

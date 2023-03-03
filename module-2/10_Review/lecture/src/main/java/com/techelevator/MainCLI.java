package com.techelevator;

import com.techelevator.dao.JdbcSightingDao;
import com.techelevator.dao.SightingDao;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.util.Scanner;

public class MainCLI {

    private final Scanner userInput = new Scanner(System.in);

    private SightingDao sightingDao;


    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/UnitedStates");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");

        MainCLI application = new MainCLI(dataSource);
        application.run();
    }

    public MainCLI(DataSource dataSource) {
        sightingDao = new JdbcSightingDao(dataSource);
    }

    private void run() {
    }

}

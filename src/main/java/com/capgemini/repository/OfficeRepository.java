package com.capgemini.repository;

import com.capgemini.ConnectionManager;
import com.capgemini.MySQLConnectionManager;
import com.capgemini.entity.Office;
import com.capgemini.exceptions.ReadFromTableException;
import org.tinylog.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class OfficeRepository implements Repository<Office> {
//    ConnectionManager manager = new MySQLConnectionManager();
    ConnectionManager manager;

    public OfficeRepository(ConnectionManager manager) {
        this.manager = manager;
    }

    @Override
    public List<Office> readAllValues() {
        return null;
    }

    @Override
    public void add(Office office) {
        String insert = "INSERT INTO offices(officeCode, city, phone, addressLine1, country, postalCode, territory) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = manager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insert)){

            connection.setAutoCommit(false);

            preparedStatement.setString(1, office.getOfficeCode());
            preparedStatement.setString(2, office.getCity());
            preparedStatement.setString(3, office.getPhone());
            preparedStatement.setString(4, office.getAddressLine1());
            preparedStatement.setString(5, office.getCountry());
            preparedStatement.setString(6, office.getPostalCode());
            preparedStatement.setString(7, office.getTerritory());


            preparedStatement.executeUpdate();

            connection.commit();



        } catch (SQLException e) {
            Logger.error(e.getMessage());
            throw new ReadFromTableException("Couldn't read data from table");
        }
    }
}

package org.obrii.mit.dp2021.fit.crudTools;


import org.obrii.mit.dp2021.fit.database.DBTools;
import org.obrii.mit.dp2021.fit.data.Data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBCrud implements ICudTools{

    public DBCrud() {
        DBTools.connectToDB();
        DBTools.checkForCreatingTable(DBTools.getTableName());
    }

    @Override
    public void createData(Data addingData) {
        DBTools.SQLrequest(String.format("INSERT INTO " + DBTools.getTableName() + " (firstName, lastName, phone, date) VALUES ('%s', '%s', '%s', '%s');",
                 addingData.getFirstName(), addingData.getLastName(), addingData.getPhone(), addingData.getDate()));
    }

    @Override
    public List<Data> readData() {
        try {
            ResultSet result = DBTools.getStatement().executeQuery(String.format("SELECT * FROM %s", DBTools.getTableName()));
            List<Data> data = new ArrayList<>();

            while (result.next()) {
                data.add(new Data(
                        result.getInt("id"),
                        result.getString("firstName"),
                        result.getString("lastName"),
                        result.getString("phone"),
                        result.getString("date")
                ));
            }
            return data;
        } catch (SQLException e) {
            return new ArrayList<>();
        }
    }

    @Override
    public void updateData(int id, Data data) {
        DBTools.SQLrequest(String.format("UPDATE " + DBTools.getTableName()+ " "
                + "SET firstName='" + data.getFirstName() + "' , "
                + "lastName=" + data.getLastName() + " , "
                + "phone='" + data.getPhone() + "' , "
                + "date='" + data.getDate() + "' "
                + "WHERE id=" + id)
        );
    }

    @Override
    public void deleteData(int id) {
        DBTools.SQLrequest("DELETE FROM " + DBTools.getTableName() + " WHERE id=" + id);
    }

    public List<Data> sortData(String keyword) {
        List<Data> newData = new ArrayList<>();
        for (Data d : readData()) {
            if (d.getFirstName().contains(keyword)) {
                newData.add(d);
            }
        }
        return newData;
    }
}

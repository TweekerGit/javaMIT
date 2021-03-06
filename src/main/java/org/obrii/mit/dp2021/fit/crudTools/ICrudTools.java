package org.obrii.mit.dp2021.fit.crudTools;

import org.obrii.mit.dp2021.fit.data.Data;

import java.util.List;

public interface ICrudTools {

    void createData(Data addingData);

    List<Data> readData();

    void updateData(int id, Data data);

    void deleteData(int id);

    void writeData(List<Data> data);

    public List<Data> sortData(String phrase);

}

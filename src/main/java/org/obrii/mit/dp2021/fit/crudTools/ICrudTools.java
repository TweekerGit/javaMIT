package org.obrii.mit.dp2021.fit.crudTools;

import org.obrii.mit.dp2021.fit.data.Data;

import javax.json.JsonArray;
import javax.json.JsonObject;
import java.util.List;

public interface ICrudTools {
    void createData(Data createData);
    List<Data> readData();
    void updateData(int id, Data newData);
    void deleteData(int id);
}

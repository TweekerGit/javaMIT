package org.obrii.mit.dp2021.fit.crudTools;

import org.obrii.mit.dp2021.fit.data.Data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Crud implements ICrudTools {

    public static File _file = null;

    public Crud(File file) {
        _file = file;
    }

    @Override
    public void createData(Data createData) {
        List<Data> temp = this.readData();
        temp.add(createData);
        WriteData.write(temp);
    }

    @Override
    public List<Data> readData() {
        try (FileInputStream f = new FileInputStream(_file); ObjectInputStream o = new ObjectInputStream(f)) {
            List<Data> temp = new ArrayList<>();
            while (f.available() > 0) {
                temp.add((Data) o.readObject());
            }
            return temp;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void updateData(int id, Data data) {
        List<Data> temp = new ArrayList<>();
        data.setId(id);
        for (Data d : this.readData()) {
            if (d.getId() != id) {
                temp.add(d);
            } else {
                temp.add(data);
            }
        }
        WriteData.write(temp);
    }

    @Override
    public void deleteData(int id) {
        List<Data> temp = new ArrayList<>();
        for (Data d : this.readData()) {
            if (d.getId() != id) {
                temp.add(d);
            }
        }
        WriteData.write(temp);
    }
}

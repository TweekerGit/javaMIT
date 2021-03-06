package org.obrii.mit.dp2021.fit.crudTools;

import org.obrii.mit.dp2021.fit.data.Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Crud implements ICrudTools {

    public static File _file;

    public Crud() {
    }

    public Crud(File file) {
        this._file = file;
    }

    @Override
    public List<Data> readData() {

        try (FileInputStream f = new FileInputStream(_file); ObjectInputStream o = new ObjectInputStream(f)) {
            List<Data> tempData = new ArrayList<>();
            while (f.available() > 0) {
                tempData.add((Data) o.readObject());
            }
            return tempData;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<Data>();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<Data>();
        }
    }

    @Override
    public void createData(Data addingData) {
        List<Data> tempData = this.readData();
        addingData.setId(tempData.size());
        tempData.add(addingData);
        WriteData.write(tempData);
    }

    @Override
    public void deleteData(int id) {
        List<Data> tempData = new ArrayList<>();
        int trueId = 0;
        for (Data d : this.readData()) {
            if (d.getId() != id) {
                d.setId(trueId++);
                tempData.add(d);
            }
        }
        WriteData.write(tempData);
    }

    @Override
    public void updateData(int id, Data data) {
        List<Data> tempData = new ArrayList<>();
        data.setId(id);
        for (Data d : this.readData()) {
            if (d.getId() != id) {
                tempData.add(d);
            } else{ tempData.add(data); }
        }
        WriteData.write(tempData);
    }

    public List<Data> sortData(String phrase) {
        List<Data> tempData = new ArrayList<>();
        for (Data d : this.readData()) {
            if(d.getFirstName().contains(phrase)){
                tempData.add(d);}
        }
        return tempData;
    }
}


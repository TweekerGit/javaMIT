package org.obrii.mit.dp2021.fit.FitLabs.crud;

import org.obrii.mit.dp2021.fit.FitLabs.data.Data;
import org.obrii.mit.dp2021.fit.FitLabs.interfaces.ISpringCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class SpringCrud {
    @Autowired
    ISpringCrud crud;

    public SpringCrud() {}


    //CRUD
    public void create(Data newData){
        crud.save(newData);
    }

    public Iterable<Data> read(){
        return crud.findAll();
    }

    public void update(Data data, Integer id){
        data.setId(id);
        crud.deleteById(id);
        crud.save(data);
    }

    public void delete(Integer id){
        crud.deleteById(id);
    }

    //Sort
    public List<Data> sort(String keyword){
        Iterable<Data> set = crud.findAll();
        Iterator<Data> iterator = set.iterator();
        List<Data> tempList = new ArrayList<>();

        while(iterator.hasNext())
        {
            Data item = iterator.next();
            if(item.getFirstName().contains(keyword)){
                tempList.add(item);
            }
        }
        return tempList;
    }
}
